class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuffer strBuffer = new StringBuffer("Hello, World!");
        System.out.println("String length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println("Index of 'o' starting from index 5: " + str.indexOf('o', 5));
        System.out.println("Convert to lowercase: " + str.toLowerCase());
        System.out.println("Buffer length: " + strBuffer.length());
        System.out.println("Append ' Java' to the buffer: " + strBuffer.append(" Java"));
        System.out.println("Insert 'Great ' at index 7: " + strBuffer.insert(7, "Great "));
        System.out.println("Replace 'World' with 'Universe': " + strBuffer.replace(7, 12, "Universe"));
        System.out.println("Reverse the buffer: " + strBuffer.reverse());
    }
}

