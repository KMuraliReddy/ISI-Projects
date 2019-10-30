using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceExercise
{
  static  class ConversationManager
    {
         public static List<ITalkable> talkables = new List<ITalkable>();
        public static void HoldConversation(params ITalkable[] itp)
        {
            foreach(ITalkable talkable in itp)
            {
                if (talkable is EnglishPerson)
                    talkable.Talk();
                if (talkable is IndianPerson)
                    talkable.Talk();
                if (talkable is Parrot)
                    talkable.Talk();
                if (talkable is Robot)
                    talkable.Talk();
            }
        }
    }
}
