import java.util.*;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setValue(inputIntValueWithScanner(sc));

        view.printMessage(View.OUR_INT + model.getValue());

        model.setDoubleValue(inputDoubleValueWithScanner(sc));

        view.printMessage(View.OUR_DOUBLE + model.getDoubleValue());

        model.setStringValue(inputStringValueWithScanner(sc));

        view.printMessage(View.OUR_STRING + model.getStringValue());
    }

    // The Utility methods
    private String inputStringValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_STRING_DATA);
        //while ( ! sc.hasNextLine()){}
        return sc.next();
    }

    private double inputDoubleValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_DOUBLE_DATA);
        while ( ! sc.hasNextDouble()){
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_DOUBLE_DATA);
            sc.next();
        }
        return sc.nextDouble();
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
