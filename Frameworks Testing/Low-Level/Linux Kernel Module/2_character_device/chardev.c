/*
	Run `mknod /dev/<name> c <major_number> 0` to access the device
	After that you can `cat /dev/<name>` to read and `echo "<message>" > /dev/<name>` to write
	Remove the device file and module when done
	
	Another useful reference: https://linux-kernel-labs.github.io/refs/heads/master/labs/device_drivers.html
*/
#include <linux/init.h>
#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/fs.h>
#include <linux/uaccess.h>

#define DEVICE_NAME "theyesdevice"/* Dev name as it appears in /proc/devices */


/// Prototypes ///////////////////////////////////////////////////////////////
static int dev_open(struct inode*, struct file*);
static int dev_release(struct inode*, struct file*);
static ssize_t dev_read(struct file*, char*, size_t, loff_t*);
static ssize_t dev_write(struct file*, const char*, size_t, loff_t*);

static struct file_operations fops = {
   .open = dev_open,
   .read = dev_read,
   .write = dev_write,
   .release = dev_release,
};

/// Initialisation and Exit //////////////////////////////////////////////////
static int major;
static int __init rickroll_init(void) {
    major = register_chrdev(0, DEVICE_NAME, &fops);

    if (major < 0) {
        printk(KERN_ALERT "Yes load failed\n");
        return major;
    }

    printk(KERN_INFO "Yes module has been loaded. Major No.: %d\n", major);
    return 0;
}

static void __exit rickroll_exit(void) {
    unregister_chrdev(major, DEVICE_NAME);
    printk(KERN_INFO "Yes module has been unloaded\n");
}

/// File Stuff /////////////////////////////////////////////////////////////////
static int dev_open(struct inode *inodep, struct file *filep) {
   printk(KERN_INFO "Yes device opened\n");
   return 0;
}

/*
* How far did the process reading the message get?
* Useful if the message is larger than the size of the
* buffer we get to fill in device_read.
*/

#define WRITE_MAX_SIZE 80
static ssize_t dev_write(struct file *filep, const char *buffer,
                         size_t len, loff_t *offset) {
	
	static char message[WRITE_MAX_SIZE];
	static unsigned long buffer_size = 0;
	
	buffer_size = len > WRITE_MAX_SIZE ? WRITE_MAX_SIZE : len;
	/* write data to the buffer */
	if ( copy_from_user(message, buffer, buffer_size) ) {
		return -EFAULT;
	}
	printk("Yes device received : %s (%lu length)", message, buffer_size);
	return buffer_size;
	
	/// For read only ////////////////////////////////////////
	//printk(KERN_INFO "Sorry, yes is read only\n");
	//return -EFAULT;
}

static int dev_release(struct inode *inodep, struct file *filep) {
   printk(KERN_INFO "Yes device closed\n");
   return 0;
}

static ssize_t dev_read(struct file *filep, char *buffer, size_t len, loff_t *offset) {
	/// One way /////////////////////////////
	int errors = 0;
    char *message = "YES\n";
    int message_len = strlen(message);
    errors = copy_to_user(buffer, message, message_len);
    return errors == 0 ? message_len : -EFAULT;
	
	/// Another way ////////////////////////////
	/*
	#define BUF_LEN 80
	static char msg[BUF_LEN]; // The msg the device will give when asked 
	static char *msg_Ptr;
	sprintf(msg, "Yes I told you stuff\n");
	msg_Ptr = msg;
	
	int bytes_read = 0; // Number of bytes actually written to the buffer 	
	if (*msg_Ptr == 0){return 0;}// If we're at the end of the message, return 0 signifying end of file 

	int length = len;
	while (length && *msg_Ptr) { // Actually put the data into the buffer 
		// The buffer is in the user data segment, not the kernel segment so "*" assignment won't work.  We have to use 
		// put_user which copies data from the kernel data segment to the user data segment. 
		put_user(*(msg_Ptr++), buffer++);
		length--;bytes_read++;
	}
	return bytes_read; // Most read functions return the number of bytes put into the buffer
    */
}

module_init(rickroll_init);
module_exit(rickroll_exit);