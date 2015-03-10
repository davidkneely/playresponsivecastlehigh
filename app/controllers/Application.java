package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Alumni;
import views.html.Contact;
import views.html.FacultyStaff;
import views.html.Index;
import views.html.StudentsParents;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render());
  }

  /**
   * Returns the Students/Parents page.
   * @return The resulting Students/Parents page.
   */
  public static Result studentsParents() {
    return ok(StudentsParents.render());
  }

  /**
   * Returns the Faculty/Staff page.
   * @return The faculty/staff page.
   */
  public static Result facultyStaff() {
    return ok(FacultyStaff.render());
  }

  /**
   * Returns the Alumni page.
   * @return The Alumni page.
   */
  public static Result alumni() {
    return ok(Alumni.render());
  }

  /**
   * Returns the Contact page.
   * @return The contact page.
   */
  public static Result contact() {
    return ok(Contact.render());
  }

}
