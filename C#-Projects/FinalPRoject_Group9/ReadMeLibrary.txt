Library Management Application
Technology Used : C# for the backend ,WPF for the front end 
Team Size : 2 people

Number Of C# Classes in the project : 6(Book,Library,LibraryMember,Magazine,Media and Movie)
Number Of Wpf Classes : 1(MainWindow.xaml.cs)

Book :
Properties :
int pageCount; //To store the pagecount of each book
string MediaInfo();//to return the pagecount 

Library :
Properties :
static List<LibraryMember> // To stroe list of library members
static List<Media>// to store list of media objects

LibraryMember :
string name ;// To store the name of the librarymember
public static Lis<Media> borrowerHistory; //To stroe the borrowes information
public static  List<Media> currentlyBorrowd;//To store the current borrowers information
public  string MemberInfo();//To return the media information

Magazine :

public int PageCount(); //To stroe the magazine page count
string MediaInfo();//to return the pagecount

Media :

  public string title ; //To store the title of media
  public string mediaType ; //To store the mediatype of media object
  public int serialNumber ; // to store the serial number of media
  public int numberOfTimesLent ;//to store ,how many times the media has lent
  public bool isAvailable;//To store whether the media is available or not
  public string libraryMember ;//To store the libraryMember name

Movie :

 public float runTime;//To store the movie runtime
 public  string MemberInfo();//To return the media information
 
 
 
 Functionality :
 
 GUI :
 Buttons : LendMedia and ReturnMedia
 Datagrids : Members Datagrid and Media datagrid
 
 * select a librarymember from membersdata grid and select a media from media datagrid then click on lendmedia to lend the media
    -> Reflection : in media datagrid item will be unchecked in available column and it will display the name of the librarymember who is borrowing the respective media in borrwer column
	-> you cant lend a media if its not vailable
	
* select a media which is not available and a libraryMember from memberdatagrid then click on return media   
    -> Reflection : item will be marked as available and the name of the libraryMember from the borrower column will be removed
    -> only the borrowe can return the media 
    -> only the unavailable item can be returned	
 
