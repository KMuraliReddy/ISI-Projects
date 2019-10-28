using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class Library
    {
    //    public static List<Book> book = new List<Book>()
    //    {
    //    new Book("Themro Dynamics"),
    //    new Book("Laws Of Motion"),
    //    new Book("Radio Activities"),
    //    new Book("Origin Of Species"),
    //    new Book("The Invention Of Zero")
    //};
    //    public static List<Magazine> magazine = new List<Magazine>()
    //    {
    //    new Magazine("Canadian Living"),
    //    new Magazine("Fashion"),
    //    new Magazine("The Economy(Canadian Business)"),
    //    new Magazine("SPORTS"),
    //    new Magazine("OutDoor Canada")
    //};
    //    public static List<Movie> movie = new List<Movie>()
    //    {
    //    new Movie("Bahubali"),
    //    new Movie("Arjun Reddy"),
    //    new Movie("Sahoo"),
    //    new Movie("Enemy At The Gates"),
    //    new Movie("American Sniper")
    //};
        public static List<LibraryMember> libraryMembers = new List<LibraryMember>()
        {
        new LibraryMember("Albert Einstein"),
        new LibraryMember("Isaac Newton"),
        new LibraryMember("Marie Curie"),
        new LibraryMember("Charles Darwin"),
        new LibraryMember("Ramanujan")
    };

        public static List<Media> members = new List<Media>()
        {
        new Book("Themro Dynamics","Book",true),
        new Book("Laws Of Motion","Book",true),
        new Book("Radio Activities","Book",true),
        new Book("Origin Of Species","Book",true),
        new Book("The Invention Of Zero","Book",true),
        new Movie("Bahubali","Movie",true),
        new Movie("Arjun Reddy","Movie",true),
        new Movie("Sahoo","Movie",true),
        new Movie("Enemy At The Gates","Movie",true),
        new Movie("American Sniper","Movie",true),
        new Magazine("Canadian Living","Magazine",true),
        new Magazine("Fashion","Magazine",true),
        new Magazine("The Economy","Magazine",true),
        new Magazine("SPORTS","Magazine",true),
        new Magazine("OutDoor Canada","Magazine",true)
        };
    }
}
