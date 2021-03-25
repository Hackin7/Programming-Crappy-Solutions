//------------------------------------------
//            TASK 1  GLOBAL WARMING
//------------------------------------------


Program GlobalWarming;

TYPE
    OneDArray = Array of LongInt;           // note: LongInt is 32 bits. 

//------------------------------------------
//  Reading the input from standard output
//------------------------------------------
PROCEDURE ReadInput  (  Var Size : LongInt;
                        Var H    : OneDArray 
                     );
        Var
            i   :LongInt;
        begin
          Readln (Size);
          SetLength (H, Size);
          For i:=0 to (Size-1)  DO Readln ( H[i] );
        end;

//------------------------------------------
//  Main routine 
//------------------------------------------

FUNCTION GW (     Size: LongInt;              // Size of input array
              Var H:    Array of LongInt      // The input sequence, indices start from 0. 
            ): LongInt;

       begin

         //  fill in your program here 

         GW :=0;


       end;

Var
   Size: LongInt;
   H   : Array of LongInt;

begin

   ReadInput (  Size, H );
   Writeln   (  GW( Size, H)  );

end.
