using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceExercise
{
    class Program
    {
        static void Main(string[] args)
        {
            ConversationManager.talkables.Add(new IndianPerson());
            ConversationManager.talkables.Add(new IndianPerson());
            ConversationManager.talkables.Add(new IndianPerson());
            ConversationManager.talkables.Add(new EnglishPerson());
            ConversationManager.talkables.Add(new EnglishPerson());
            ConversationManager.talkables.Add(new EnglishPerson());
            ConversationManager.talkables.Add(new Parrot());
            ConversationManager.talkables.Add(new Parrot());
            ConversationManager.talkables.Add(new Parrot());
            ConversationManager.talkables.Add(new Robot());
            ConversationManager.talkables.Add(new Robot());
            ConversationManager.talkables.Add(new Robot());

           foreach(ITalkable i in ConversationManager.talkables)
            {
                ConversationManager.HoldConversation(i);
            }
            Console.ReadKey();
        }
    }
}
