package sg.gov.tech.ctf.mobile;

import a.b.k.d;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import c.a.a.a;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import sg.gov.tech.ctf.mobile.Admin.AdminAuthenticationActivity;
import sg.gov.tech.ctf.mobile.Contact.ContactForm;
import sg.gov.tech.ctf.mobile.Info.CovidInfoActivity;
import sg.gov.tech.ctf.mobile.User.AuthenticationActivity;

public class MainActivity extends d {
    public static final UUID CHARACTERISTIC_UUID = UUID.fromString(a.a(-7299909988280L));
    public static final UUID SERVICE_UUID = UUID.fromString(a.a(-7140996198328L));
    public static final String TAG = a.a(-7063686787000L);
    public static int counter = 0;
    public BluetoothLeAdvertiser bLeAdvertiser;
    public BluetoothGattServer bluetoothGattServer;
    public BluetoothManager bluetoothManager;
    public BroadcastReceiver bluetoothReceiver = new BroadcastReceiver() {
        /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass6 */

        public void onReceive(Context context, Intent intent) {
            int state = intent.getIntExtra(a.a(-4856073596856L), 10);
            if (state == 10) {
                MainActivity.this.stopServer();
                MainActivity.this.stopAdvertising();
            } else if (state == 12) {
                MainActivity.this.startAdvertising();
                MainActivity.this.startServer();
            }
        }
    };
    public BluetoothGattCharacteristic characteristic;
    public final String flag = a.a(-6148858752952L);
    public final String flag2 = a.a(-6243348033464L);
    public final String flag3 = a.a(-6320657444792L);
    public final String flag4 = a.a(-6397966856120L);
    public final String flag5 = a.a(-6475276267448L);
    public BluetoothGattServerCallback gattServerCallback = new BluetoothGattServerCallback() {
        /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass8 */

        public void onConnectionStateChange(BluetoothDevice device, int status, int newState) {
            if (newState == 2) {
                String a2 = a.a(-5371469672376L);
                Log.i(a2, a.a(-5448779083704L) + device);
            } else if (newState == 0) {
                String a3 = a.a(-5569038167992L);
                Log.i(a3, a.a(-5646347579320L) + device);
                MainActivity.this.registeredDevices.remove(device);
            }
        }

        public void onCharacteristicReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattCharacteristic characteristic) {
            super.onCharacteristicReadRequest(device, requestId, offset, characteristic);
            String masterFlag = a.a(-5779491565496L);
            int i = MainActivity.counter % 5;
            if (i == 0) {
                masterFlag = a.a(-5783786532792L);
            } else if (i == 1) {
                masterFlag = a.a(-5878275813304L);
            } else if (i == 2) {
                masterFlag = a.a(-5955585224632L);
            } else if (i == 3) {
                masterFlag = a.a(-6032894635960L);
            } else if (i == 4) {
                masterFlag = a.a(-6110204047288L);
            }
            MainActivity.this.bluetoothGattServer.sendResponse(device, requestId, 0, 0, MainActivity.convertStringToByte(masterFlag));
            MainActivity.access$708();
        }

        public void onCharacteristicWriteRequest(BluetoothDevice device, int requestId, BluetoothGattCharacteristic characteristic, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) {
            super.onCharacteristicWriteRequest(device, requestId, characteristic, preparedWrite, responseNeeded, offset, value);
        }

        public void onDescriptorReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattDescriptor descriptor) {
            super.onDescriptorReadRequest(device, requestId, offset, descriptor);
        }

        public void onDescriptorWriteRequest(BluetoothDevice device, int requestId, BluetoothGattDescriptor descriptor, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) {
            super.onDescriptorWriteRequest(device, requestId, descriptor, preparedWrite, responseNeeded, offset, value);
        }
    };
    public AdvertiseCallback mAdvertiseCallback = new AdvertiseCallback() {
        /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass7 */

        public void onStartSuccess(AdvertiseSettings settingsInEffect) {
            Log.i(a.a(-5019282354104L), a.a(-5096591765432L));
        }

        public void onStartFailure(int errorCode) {
            String a2 = a.a(-5195376013240L);
            Log.w(a2, a.a(-5272685424568L) + errorCode);
        }
    };
    public Button path1;
    public Button path2;
    public Button path3;
    public Button pathExtra;
    public Set<BluetoothDevice> registeredDevices = new HashSet();
    public BluetoothGattService service;
    public Button version;

    public static /* synthetic */ int access$708() {
        int i = counter;
        counter = i + 1;
        return i;
    }

    @Override // androidx.activity.ComponentActivity, a.h.d.d, a.k.a.d, a.b.k.d
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.activity_main);
        this.version = (Button) findViewById(R.id.version);
        this.path1 = (Button) findViewById(R.id.path1);
        this.path2 = (Button) findViewById(R.id.path2);
        this.path3 = (Button) findViewById(R.id.path3);
        this.pathExtra = (Button) findViewById(R.id.path4);
        this.version.setOnClickListener(new View.OnClickListener() {
            /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass1 */

            public void onClick(View view) {
                Toast.makeText(MainActivity.this.getApplicationContext(), a.a(-3657777721272L), 0).show();
                if (!MainActivity.this.getPackageManager().hasSystemFeature(a.a(-3730792165304L))) {
                    Toast.makeText(MainActivity.this.getApplicationContext(), a.a(-3859641184184L), 1).show();
                    MainActivity.this.finish();
                } else {
                    Toast.makeText(MainActivity.this.getApplicationContext(), a.a(-3936950595512L), 0).show();
                }
                MainActivity.this.getWindow().addFlags(128);
                MainActivity mainActivity = MainActivity.this;
                mainActivity.bluetoothManager = (BluetoothManager) mainActivity.getSystemService(a.a(-4001375104952L));
                BluetoothAdapter bluetoothAdapter = MainActivity.this.bluetoothManager.getAdapter();
                IntentFilter filter = new IntentFilter(a.a(-4044324777912L));
                MainActivity mainActivity2 = MainActivity.this;
                mainActivity2.registerReceiver(mainActivity2.bluetoothReceiver, filter);
                if (!bluetoothAdapter.isEnabled()) {
                    Log.d(a.a(-4246188240824L), a.a(-4323497652152L));
                    bluetoothAdapter.enable();
                    return;
                }
                Log.d(a.a(-4572605755320L), a.a(-4649915166648L));
                MainActivity.this.startAdvertising();
                MainActivity.this.startServer();
            }
        });
        this.path1.setOnClickListener(new View.OnClickListener() {
            /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass2 */

            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, AdminAuthenticationActivity.class));
            }
        });
        this.path2.setOnClickListener(new View.OnClickListener() {
            /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass3 */

            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, CovidInfoActivity.class));
            }
        });
        this.path3.setOnClickListener(new View.OnClickListener() {
            /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass4 */

            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, AuthenticationActivity.class));
            }
        });
        this.pathExtra.setOnClickListener(new View.OnClickListener() {
            /* class sg.gov.tech.ctf.mobile.MainActivity.AnonymousClass5 */

            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, ContactForm.class));
            }
        });
    }

    @Override // a.k.a.d, a.b.k.d
    public void onDestroy() {
        super.onDestroy();
        if (this.bluetoothGattServer != null) {
            stopServer();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startServer() {
        Log.d(a.a(-6513930973112L), a.a(-6591240384440L));
        BluetoothGattServer openGattServer = this.bluetoothManager.openGattServer(this, this.gattServerCallback);
        this.bluetoothGattServer = openGattServer;
        if (openGattServer == null) {
            Log.w(a.a(-6664254828472L), a.a(-6741564239800L));
            return;
        }
        this.service = new BluetoothGattService(SERVICE_UUID, 0);
        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(CHARACTERISTIC_UUID, 26, 17);
        this.characteristic = bluetoothGattCharacteristic;
        this.service.addCharacteristic(bluetoothGattCharacteristic);
        this.bluetoothGattServer.addService(this.service);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void stopServer() {
        BluetoothGattServer bluetoothGattServer2 = this.bluetoothGattServer;
        if (bluetoothGattServer2 != null) {
            bluetoothGattServer2.close();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startAdvertising() {
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.bluetoothManager.getAdapter().getBluetoothLeAdvertiser();
        this.bLeAdvertiser = bluetoothLeAdvertiser;
        if (bluetoothLeAdvertiser == null) {
            Log.w(a.a(-6866118291384L), a.a(-6943427702712L));
            return;
        }
        this.bLeAdvertiser.startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(1).setConnectable(true).setTimeout(0).setTxPowerLevel(2).build(), new AdvertiseData.Builder().setIncludeDeviceName(true).setIncludeTxPowerLevel(false).build(), this.mAdvertiseCallback);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void stopAdvertising() {
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.bLeAdvertiser;
        if (bluetoothLeAdvertiser != null) {
            bluetoothLeAdvertiser.stopAdvertising(this.mAdvertiseCallback);
        }
    }

    public static byte[] convertStringToByte(String str) {
        return str.getBytes();
    }
}
