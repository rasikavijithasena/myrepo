/**
 * Created by hsenid on 9/13/17.
 */
public class WildCardsTest<T> {


        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }

        public <U extends Number> void inspect(U u){
            System.out.println("T: " + t.getClass().getName());    //output - T type
            System.out.println("U: " + u.getClass().getName());    //output - U type
        }

        public static void main(String[] args) {
            WildCardsTest<Integer> integerBox = new WildCardsTest<Integer>();
            integerBox.set(new Integer(10));
            //integerBox.inspect("some text"); // error: this is still String!
            integerBox.inspect(10.4);

            WildCardsTest<String> integerBox1 = new WildCardsTest<String>();
            integerBox1.set(new String("fdfdf"));
            integerBox1.inspect(10.4);


        }



}
