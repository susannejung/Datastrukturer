package FilEksempler;

public class TestStack {
          public static void main(String[] args) {
            java.util.Stack<String> stak = new java.util.Stack<>();
            stak.push("Oklahoma");
            stak.push("Indiana");
            stak.push("Georgia");
            stak.push("Texas");

            while (stak.size() > 0)
                System.out.print(stak.pop() + " ");

        }
    }

