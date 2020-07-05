fn main() {
    print!("Please enter a number to check: ");
use std::io::{stdin,stdout,Write};
    let mut input=String::new();
    let _=stdout().flush();
    stdin().read_line(&mut input).expect("Did not enter a correct string");

    input = input.trim().to_string();
    let val: u32 = input.parse().unwrap();
    println!("You input in {}", input);

    let power:u32 = input.chars().count() as u32;
    let mut calc:u32 = 0;
    for c in input.chars() {
        let v: u32 = c.to_string().parse().unwrap();
        calc += v.pow(power);
        // do something with character `c` and index `i`
    }
    if val==calc{println!("This is an Armstrong Number");}
    else{println!("This is not an Armstrong Number");}
}