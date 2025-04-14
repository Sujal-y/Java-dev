package src.oops_labs.lab7;
//Create a Building class with two subclasses namely, House and School. The Building class contains fields for
// square footage and stories. The House class contains additional fields for number of bedrooms and baths.
// The School class contains additional fields for number of classrooms and grade level
// (for example, elementary or junior high). All the classes contain appropriate overloaded constructors and methods
// to display the details. In a separate class that contains main(), demonstrate the working of this hierarchy.
class building{
    int sqarefootage,stories;
    // Default constructor
    public building() {
        this.sqarefootage = 0;
        this.stories = 0;
    }

    // Overloaded constructor
    public building(int squareFootage, int stories) {
        this.sqarefootage = squareFootage;
        this.stories = stories;
    }

    public void displayDetails() {
        System.out.println("Building Details:");
        System.out.println("Square Footage: " + sqarefootage);
        System.out.println("Stories: " + stories);
    }
}


class house extends building{
    int bedrooms,baths;
    // Default constructor
    public house() {
        super();
        this.bedrooms = 0;
        this.baths = 0;
    }

    // Overloaded constructor
    public house(int squareFootage, int stories, int bedrooms, int baths) {
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Baths: " + baths);
    }
}

class school extends building{
    int no_of_classrooms;
    String grade_level;
    // Default constructor
    public school() {
        super();
        this.no_of_classrooms = 0;
        this.grade_level = "Unknown";
    }

    // Overloaded constructor
    public school(int squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.no_of_classrooms = classrooms;
        this.grade_level = gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Classrooms: " + no_of_classrooms);
        System.out.println("Grade Level: " + grade_level);
    }
}
public class prog3 {
    public static void main(String[] args) {
        house house = new house(2500, 2, 4, 3);
        school school = new school(10000, 3, 20, "Elementary");

        System.out.println("=== House ===");
        house.displayDetails();

        System.out.println("\n=== School ===");
        school.displayDetails();
    }

}
