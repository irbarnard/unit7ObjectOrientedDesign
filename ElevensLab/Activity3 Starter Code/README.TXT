Activity one questions:
n/a

Activity 2 questions:
1) A deck HAS (a) card(s).
2) The deck contains three cards because the values list has 3 items in it.
3) In the ranks array  ["Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"] 
   In the values array [11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2]
   In the suits array  ["Diamonds", "Hearts", "Spades", "Clubs"]
4) Yes the order matters because the order of ranks and the order of values correspond and that correspondance
   is used to determine which card has which value.
   
Activity 3 questions:
1) public static String flip()
    {
        Random rand = new Random();
        int r = rand.nextInt(3);
        String h = "Heads";
        String t = "Tails";
        if( (r == 1) || (r ==2))
        {
            return h;
        }
        else
        {
            return t;
        }
    }

2) public static boolean arePermutations(int[]a1, int[]a2)
    {
        for(int i = 0; i < a1.length; i ++)
        {
            if(a1[i] == a2[i])
            {
                return false;
            }
        }
        return true;
    }

3) 1, 2 , 3, 4