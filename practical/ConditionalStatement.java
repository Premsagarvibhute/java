class ConditionalStatement{
        public void calc(){
               int x = 43;
              int y = 21;
              if(x > y){
                 System.out.println("x is greater than y.");
}
              else{
                 System.out.println("x is not greater than y");
}
}
        public static void main(String args[]){
              ConditionalStatement obj = new ConditionalStatement();
              obj.calc();
}
}