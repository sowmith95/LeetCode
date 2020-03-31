class Reverse_Integer {
    public int reverse(int x) {
            int reverse = 0;
            while(x != 0){
                int value = x%10;
                x = x/10;
                if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && value > 7)) return 0;
                if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && value < -8)) return 0;
                reverse = (reverse * 10) + value;
            }
            return reverse;
    }
}
