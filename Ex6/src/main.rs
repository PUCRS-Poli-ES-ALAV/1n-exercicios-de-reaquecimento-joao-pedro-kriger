fn ackermann(m: u32, n: u32) -> u32 {
    if m == 0 {
        n + 1
    } else if n == 0 {
        ackermann(m - 1, 1)
    } else {
        ackermann(m - 1, ackermann(m, n - 1))
    }
}

fn main() {
    let m = 3;
    let n = 4;
    
    println!("A({}, {}) = {}", m, n, ackermann(m, n));
}
