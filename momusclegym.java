public class MoMuscleGym {
    // Declare instance variables for membership details
    private String membershipType;
    private double membershipFee;
    private int durationMonths;

    // Constructor to initialize membership details
    public MoMuscleGym(String membershipType, double membershipFee, int durationMonths) {
        this.membershipType = membershipType;
        this.membershipFee = membershipFee;
        this.durationMonths = durationMonths;
    }

    // Method to display membership details
    public void displayMembershipDetails() {
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Membership Fee: $" + membershipFee);
        System.out.println("Duration: " + durationMonths + " months");
        System.out.println();
    }

    public static void main(String[] args) {
        // Declare and initialize an array of MoMuscleGym objects for different memberships
        MoMuscleGym[] memberships = new MoMuscleGym[4];
        
        // Initialize the array with different membership types
        memberships[0] = new MoMuscleGym("Basic", 30.0, 1);
        memberships[1] = new MoMuscleGym("Standard", 50.0, 3);
        memberships[2] = new MoMuscleGym("Premium", 90.0, 6);
        memberships[3] = new MoMuscleGym("VIP", 150.0, 12);

        // Iterate through the array and print details of each membership
        System.out.println("Mo'Muscle Gym Membership Details:");
        for (MoMuscleGym membership : memberships) {
            membership.displayMembershipDetails();
        }
    }
}
