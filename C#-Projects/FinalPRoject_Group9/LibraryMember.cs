using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class LibraryMember
    {
        public string name { get;   set ; }
        public LibraryMember(string libraryMemeber)
        {
            this.name = libraryMemeber;

        }

       public  static List<Media> borrowHistory = new List<Media>();
        
       public static  List<Media> currentlyBorrowd = new List<Media>();
        public static string MemberInfo()
        {
            string s = "";
            foreach(Media m in borrowHistory)
            {
                s = s + m.libraryMember+ " : "+m.mediaType+" : " +m.title;
            }
            return s ;
        }
    }
}
