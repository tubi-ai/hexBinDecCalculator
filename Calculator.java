import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

//implementing ActionListener interface
public class Calculator implements ActionListener {
    //Creating variables for our calculations
    double number;
    double answer;
    int calculation;
    static String hexNum = null, binNum = null, decNum = null;
    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JRadioButton hexRadioButton = new JRadioButton("Hex");
    JRadioButton binRadioButton = new JRadioButton("Bin");
    JRadioButton decRadioButton = new JRadioButton("Dec");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonA = new JButton("A");
    JButton buttonB = new JButton("B");
    JButton buttonC = new JButton("C");
    JButton buttonD = new JButton("D");
    JButton buttonE = new JButton("E");
    JButton buttonF = new JButton("F");
    JButton buttonOr = new JButton("Or");
    JButton buttonAnd = new JButton("And");
    JButton buttonXor = new JButton("Xor");
    JButton buttonNot = new JButton("Not");
    JButton buttonSLeft = new JButton("S_Left");
    JButton buttonSRight = new JButton("S_Right");

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(440, 610);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);


        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        hexRadioButton.setBounds(80, 95, 60, 40);
        hexRadioButton.setSelected(true);
        hexRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        hexRadioButton.setBackground(Color.black);
        hexRadioButton.setForeground(Color.white);
        frame.add(hexRadioButton);

        binRadioButton.setBounds(80, 120, 60, 40);
        binRadioButton.setSelected(false);
        binRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        binRadioButton.setBackground(Color.black);
        binRadioButton.setForeground(Color.white);
        frame.add(binRadioButton);

        decRadioButton.setBounds(150, 95, 60, 40);
        decRadioButton.setSelected(true);
        decRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        decRadioButton.setBackground(Color.black);
        decRadioButton.setForeground(Color.white);
        frame.add(decRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        ButtonGroup bdx = new ButtonGroup();
        bdx.add(hexRadioButton);
        bdx.add(binRadioButton);
        bdx.add(decRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonA.setBounds(10, 410, 60, 40);
        buttonA.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonA);

        buttonB.setBounds(80, 410, 60, 40);
        buttonB.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonB);

        buttonC.setBounds(150, 410, 60, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonC);

        buttonD.setBounds(10, 470, 60, 40);
        buttonD.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonD);

        buttonE.setBounds(80, 470, 60, 40);
        buttonE.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonE);

        buttonF.setBounds(150, 470, 60, 40);
        buttonF.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonF);

        buttonDot.setBounds(150, 530, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 530, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 470, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 350, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonReciprocal);

        buttonOr.setBounds(290, 170, 60, 40);
        buttonOr.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOr);

        buttonAnd.setBounds(290, 230, 60, 40);
        buttonAnd.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonAnd);

        buttonXor.setBounds(290, 290, 60, 40);
        buttonXor.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonXor);

        buttonNot.setBounds(290, 350, 60, 40);
        buttonNot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNot);

        buttonSLeft.setBounds(220, 410, 60, 40);
        buttonSLeft.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSLeft);

        buttonSRight.setBounds(290, 410, 60, 40);
        buttonSRight.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSRight);

        buttonDelete.setBounds(220, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        //buttonDelete.setBackground(Color.red);
        //buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(290, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        //buttonClear.setBackground(Color.red);
        //buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

    }

    public void addActionEvent() {
        //Registering ActionListener to buttons
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        hexRadioButton.addActionListener(this);
        binRadioButton.addActionListener(this);
        decRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonSLeft.addActionListener(this);
        buttonSRight.addActionListener(this);
        buttonOr.addActionListener(this);
        buttonXor.addActionListener(this);
        buttonNot.addActionListener(this);
        buttonAnd.addActionListener(this);

    }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enable();//Calling enable() function
        }
        if (source == hexRadioButton)
            hexEnable();
        else if (source == binRadioButton)
            binEnable();
        else if (source == decRadioButton)
            decEnable();
        else if (source == offRadioButton) {
            disable();//Calling disable function
        } else if (source == buttonClear) {
            //Clearing texts of label and text field
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            //Setting functionality for delete button(backspace)
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            textField.setText(textField.getText() + "0");
            decNum += "0"; hexNum += "0"; binNum += "0";

        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
            decNum += "1"; hexNum += "1"; binNum += "1";
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
            decNum += "2"; hexNum += "2";
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
            decNum += "3"; hexNum += "3";
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
            decNum += "4"; hexNum += "4";
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
            decNum += "5"; hexNum += "5";
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
            decNum += "6"; hexNum += "6";
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
            decNum += "7"; hexNum += "7";
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
            decNum += "8"; hexNum += "8";
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
            decNum += "9"; hexNum += "9";
        } else if (source == buttonA) {
            textField.setText(textField.getText() + "A");
            hexNum += "A";
        } else if (source == buttonB) {
            textField.setText(textField.getText() + "B");
            hexNum += "B";
        } else if (source == buttonC) {
            textField.setText(textField.getText() + "C");
            hexNum += "C";
        } else if (source == buttonD) {
            textField.setText(textField.getText() + "D");
            hexNum += "D";
        } else if (source == buttonE) {
            textField.setText(textField.getText() + "E");
            hexNum += "E";
        } else if (source == buttonF) {
            textField.setText(textField.getText() + "F");
            hexNum += "F";
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
                decNum += "."; hexNum += "."; binNum += ".";
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            if (binRadioButton.isSelected()) {
                number = Double.parseDouble(binToDec(textField.getText()));
            } else if (hexRadioButton.isSelected()) {
                number = Double.parseDouble(hexToDec(textField.getText()));
            } else if (decRadioButton.isSelected()) {
                number = Double.parseDouble(textField.getText());
            }
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            if (binRadioButton.isSelected()) {
                number = Double.parseDouble(binToDec(textField.getText()));
            } else if (hexRadioButton.isSelected()) {
                number = Double.parseDouble(hexToDec(textField.getText()));
            } else if (decRadioButton.isSelected()) {
                number = (double) Double.parseDouble(textField.getText());
            }
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            if (binRadioButton.isSelected()) {
                number = Double.parseDouble(binToDec(textField.getText()));
            } else if (hexRadioButton.isSelected()) {
                number = Double.parseDouble( hexToDec(textField.getText()));
            } else if (decRadioButton.isSelected()) {
                number = Double.parseDouble(textField.getText());
            }
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            if (binRadioButton.isSelected()) {
                number = Double.parseDouble( binToDec(textField.getText()));
            } else if (hexRadioButton.isSelected()) {
                number = Double.parseDouble(hexToDec(textField.getText()));
            } else if (decRadioButton.isSelected()) {
                number = Double.parseDouble(textField.getText());
            }
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            if (binRadioButton.isSelected()) {
                number = Double.parseDouble(binToDec(textField.getText()));
            } else if (hexRadioButton.isSelected()) {
                number = Double.parseDouble(hexToDec(textField.getText()));
            } else if (decRadioButton.isSelected()) {
                number = Double.parseDouble(textField.getText());
            }
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:

                    //answer = number + Double.parseDouble(textField.getText());
                    if (binRadioButton.isSelected()) {
                        answer = number + Double.parseDouble(binToDec(textField.getText()));
                        String ans=decToBin(Double.toString(answer));
                        textField.setText(ans);
                    } else if (hexRadioButton.isSelected()) {
                        answer = number + Double.parseDouble(hexToDec(textField.getText()));
                        String ans=decToHex(Double.toString(answer));
                        textField.setText(ans);
                    } else if (decRadioButton.isSelected()) {
                        answer = number + Double.parseDouble(textField.getText());
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                    }

                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (binRadioButton.isSelected()) {
                        answer = Double.parseDouble(decToBin(textField.getText()));
                    } else if (hexRadioButton.isSelected()) {
                        answer = Double.parseDouble(decToHex(textField.getText()));
                    } else if (decRadioButton.isSelected()) {
                        answer = Double.parseDouble(textField.getText());
                    }
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (binRadioButton.isSelected()) {
                        answer = Double.parseDouble(decToBin(textField.getText()));
                    } else if (hexRadioButton.isSelected()) {
                        answer = Double.parseDouble(decToHex(textField.getText()));
                    } else if (decRadioButton.isSelected()) {
                        answer = Double.parseDouble(textField.getText());
                    }
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (binRadioButton.isSelected()) {
                        answer = Double.parseDouble(decToBin(textField.getText()));
                    } else if (hexRadioButton.isSelected()) {
                        answer = Double.parseDouble(decToHex(textField.getText()));
                    } else if (decRadioButton.isSelected()) {
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                    }
                    textField.setText(Double.toString(answer));

                    label.setText("");
                    break;
            }
        }
    }

    public void enable() {
        onRadioButton.setEnabled(false);
        hexRadioButton.setEnabled(true);
        binRadioButton.setEnabled(true);
        decRadioButton.setEnabled(true);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
        buttonE.setEnabled(true);
        buttonF.setEnabled(true);
        buttonSLeft.setEnabled(true);
        buttonSRight.setEnabled(true);
        buttonOr.setEnabled(true);
        buttonXor.setEnabled(true);
        buttonNot.setEnabled(true);
        buttonAnd.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        hexRadioButton.setEnabled(false);
        binRadioButton.setEnabled(false);
        decRadioButton.setEnabled(false);
        offRadioButton.setEnabled(false);
        textField.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);
        buttonSLeft.setEnabled(false);
        buttonSRight.setEnabled(false);
        buttonOr.setEnabled(false);
        buttonXor.setEnabled(false);
        buttonNot.setEnabled(false);
        buttonAnd.setEnabled(false);
    }

    public void hexEnable() {
        onRadioButton.setEnabled(false);
        hexRadioButton.setEnabled(false);
        binRadioButton.setEnabled(true);
        decRadioButton.setEnabled(true);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
        buttonE.setEnabled(true);
        buttonF.setEnabled(true);
        buttonSLeft.setEnabled(true);
        buttonSRight.setEnabled(true);
        buttonOr.setEnabled(true);
        buttonXor.setEnabled(true);
        buttonNot.setEnabled(true);
        buttonAnd.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
    }

    public static String hexToDec(String hex) {
        // Parse a hexadecimal string and return the corresponding integer value
        return Integer.toString(Integer.parseInt(hex, 16));

    }

    public static String decToHex(String dec) {
        int decimal = Integer.parseInt(dec);
        String hex = Integer.toHexString(decimal);
        return hex;
    }

    public static String binToHex(String bin) {
        // Convert the binary number to a hexadecimal number
        String hex = Integer.toHexString(Integer.parseInt(bin, 2));
        return hex;
    }

    public void binEnable() {
        onRadioButton.setEnabled(false);
        hexRadioButton.setEnabled(true);
        binRadioButton.setEnabled(false);
        decRadioButton.setEnabled(true);
        offRadioButton.setEnabled(true);
        textField.setText("");
        label.setText(" ");
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);
        buttonSLeft.setEnabled(true);
        buttonSRight.setEnabled(true);
        buttonOr.setEnabled(true);
        buttonXor.setEnabled(true);
        buttonNot.setEnabled(true);
        buttonAnd.setEnabled(true);
    }

    public static String binToDec(String binary) {
        // Parse a hexadecimal string and return the corresponding integer value
        return Integer.toString(Integer.parseInt(binary, 2));
    }

    public static String decToBin(String dec) {
        int decimal = Integer.parseInt(dec);
        String bin = Integer.toBinaryString(decimal);
        return bin;
    }

    public static String hexToBin(String hex) {
        // Convert the hexadecimal number to a binary number
        String bin = Integer.toBinaryString(Integer.parseInt(hex, 16));
        return bin;
    }

    public void decEnable() {
        onRadioButton.setEnabled(false);
        hexRadioButton.setEnabled(true);
        binRadioButton.setEnabled(true);
        decRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);
        buttonSLeft.setEnabled(false);
        buttonSRight.setEnabled(false);
        buttonOr.setEnabled(false);
        buttonXor.setEnabled(false);
        buttonNot.setEnabled(false);
        buttonAnd.setEnabled(false);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
    }
}

