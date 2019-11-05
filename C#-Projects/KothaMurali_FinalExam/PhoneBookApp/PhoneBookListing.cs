using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PhoneBookApp
{
    class PhoneBookListing
    {
      public string LastName { get; set; }
        public string FirstName { get; set; }
        public string PhoneNumber { get; set; }
        public PhoneBookListing(string _lastName,string _firstName,string _phoneNumber)
        {
            LastName = _lastName;
            FirstName = _firstName;
            PhoneNumber = _phoneNumber;

        }

    }
}
