using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    static class Library
    {
  
        public static  List<LibraryMember> libraryMembers = new List<LibraryMember>()
        {
        new LibraryMember("Albert Einstein"),
        new LibraryMember("Isaac Newton"),
        new LibraryMember("Marie Curie"),
        new LibraryMember("Charles Darwin"),
        new LibraryMember("Ramanujan")
    };

        public static List<Media> media = new List<Media>()
        {
        new Book("Themro Dynamics","Book",64),
        new Book("Laws Of Motion","Book",56),
        new Book("Radio Activities","Book",56),
        new Book("Origin Of Species","Book",56),
        new Book("The Invention ","Book",56),
        new Movie(5,"Bahubali","Movie"),
        new Movie(5,"Arjun Reddy","Movie"),
        new Movie(6,"Sahoo","Movie"),
        new Movie(7,"Enemy At The Gates","Movie"),
        new Movie(8,"American Sniper","Movie"),
        new Magazine("Canadian Living","Magazine",150),
        new Magazine("Fashion","Magazine",89),
        new Magazine("The Economy","Magazine",635),
        new Magazine("SPORTS","Magazine",235),
        new Magazine("Incredible INDIA","Magazine",568)
        };
    }
}
