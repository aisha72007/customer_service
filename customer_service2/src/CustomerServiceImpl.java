public class CustomerServiceImpl implements CustomerService{
    @Override
    public void fname(String firstName) {
        if (firstName.length() < 2){
            System.out.println("Your name is not available");
        }
    }

    @Override
    public void lname(String lastName) {
        if (lastName.length() < 2){
            System.out.println("Your name is not available");
        }
    }

    @Override
    public void pnumber(String phoneNumber) {
        if (phoneNumber.length() > 40){
            System.out.println("Your Phone Number is not available");
        }
    }
}
