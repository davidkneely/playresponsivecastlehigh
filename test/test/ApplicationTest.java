package test;

import org.junit.Test;
import play.twirl.api.Content;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;


/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class ApplicationTest {

  /**
   * Tests that 1+1 equals 2.
   */
  @Test
  public void simpleCheck() {
    int a = 1 + 1;
    assertThat(a).isEqualTo(2);
  }

  /**
   * Tests that the Index template renders correctly.
   */
  @Test
  public void renderTemplate() {
    Content html = views.html.Index.render();
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Welcome");
  }

  /**
   * Tests that the Students/Parents template renders correctly.
   */
  @Test
  public void renderStudentsParentsTemplate() {
    Content html = views.html.StudentsParents.render();
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Students");
  }

  /**
   * Tests that the Faculty/Staff template renders correctly.
   */
  @Test
  public void renderFacultyStaffTemplate() {
    Content html = views.html.FacultyStaff.render();
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Faculty");
  }

  /**
   * Tests that the Alumni template renders correctly.
   */
  @Test
  public void renderAlumniTemplate() {
    Content html = views.html.Alumni.render();
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Alumni");
  }

  /**
   * Tests that the Contact Us template renders correctly.
   */
  @Test
  public void renderContactUsTemplate() {
    Content html = views.html.Contact.render();
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Contact");
  }


}
