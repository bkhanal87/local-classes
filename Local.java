// Define a local class inside any block

// the Local class validates two phone numbers. It defines the local class PhoneNumber in the method ValidatePhoneNumber

public class Local {
    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
        final int numberLength = 10;

        class PhoneNumber {
            String formatterPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formatterPhoneNumber = currentNumber;
                else
                    formatterPhoneNumber = null;
            }

            public String getNumber() {
                return formatterPhoneNumber;
            }

            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 + " and "+ phoneNumber2);
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);


        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());

        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "123-456-789022");
    }
}
