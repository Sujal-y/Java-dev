package src.oops_labs.lab7;
//Create a Building class with two subclasses namely, House and School. The Building class contains fields for
// square footage and stories. The House class contains additional fields for number of bedrooms and baths.
// The School class contains additional fields for number of classrooms and grade level
// (for example, elementary or junior high). All the classes contain appropriate overloaded constructors and methods
// to display the details. In a separate class that contains main(), demonstrate the working of this hierarchy.
class building{
    int sqarefootage,stories;
}

class house extends building{
    int bedrooms,baths;
}
class school extends building{
    int no_of_classrooms;
    String grade_level;
}
public class prog3 {

}
