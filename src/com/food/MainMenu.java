package com.food;


import com.food.FoodItems.Burger;
import com.food.FoodItems.Drinks;
import com.food.FoodItems.Pizza;
import com.food.FoodItems.TemplateFood;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Hashtable;


///////////////////////////////                          -----    MAIN CLASS      ----                 ////////////////////////////////////////


public class MainMenu{

    JFrame frame = new JFrame();


    private JLabel burger;
    private JLabel pizza;
    public static JComboBox SelectedBurger;
    public static   JComboBox SelectedPizza;
    public static JComboBox SelectedDrinks;
    private JLabel drinks;
    private JLabel image;
    private JButton return11;
    private JLabel orderItems;
    public static JTextField pay_price;
    private JButton deletee;
    private JButton Order_Items;
    public static   JTable order_table;
    public static DefaultTableModel model ;
    private JLabel total_price;



    mm MM = new mm();




    data DataConnect = new data();



    public MainMenu(){



        String[] SelectBur = {"No Items","Chicken", "Zinger", "Beef"};
        String[] SelectPizz = {"No Items","Chicken Fajita", "BBQ Ranch", "Phantom"};
        String[] SelectDrink = {"No Items","Pepsi", "Fanta", "7UP"};





        //construct components
        order_table = new JTable(model);
        burger = new JLabel ("               Burger");
        pizza = new JLabel ("             Pizza");
        SelectedBurger = new JComboBox (SelectBur);
        SelectedPizza = new JComboBox (SelectPizz);
        SelectedDrinks = new JComboBox (SelectDrink);
        drinks = new JLabel ("            Drinks");
        image = new JLabel();
//        price_txt = new JTextField (5);
        return11 = new JButton ("Return");
//        orderrr = new JButton ("Order");
//        textArea = new JTextArea (5, 5);
        orderItems = new JLabel ("                Ordered Item");
        pay_price = new JTextField (5);
        deletee = new JButton ("Delete");
        Order_Items = new JButton ("Order");
        order_table.setSize(700 , 1000);
        total_price = new JLabel("Total Price: ");



        //adjust size and set layout
        frame.setPreferredSize (new Dimension (667, 366));
        frame.setLayout (null);

        //add components
        frame.add (burger);
        frame.add (pizza);
        frame.add (SelectedBurger);
        frame.add (SelectedPizza);
        frame.add (SelectedDrinks);
        frame.add (drinks);
        frame.add (image);
//        frame.add (price_txt);
        frame.add (return11);
//        frame.add (orderrr);
//        frame.add (textArea);
        frame.add (orderItems);
        frame.add (pay_price);
        frame.add (deletee);
        frame.add (Order_Items);
        frame.add(total_price);
//        frame.add(new JScrollPane(order_table));
//        frame.add(pane);
//        pane.setViewportView(order_table);
//        frame.add(order_table);
        JScrollPane pane = new JScrollPane(order_table);
        frame.setLayout(null);
        frame.add(pane);

        pay_price.setEnabled(false);
        pay_price.setDisabledTextColor(Color.black);
        order_table.setEnabled(false);




        frame.setResizable(false);

        SelectedBurger.addActionListener(MM);
        SelectedPizza.addActionListener(MM);
        SelectedDrinks.addActionListener(MM);
        deletee.addActionListener(MM);
        Order_Items.addActionListener(DataConnect);

        //set component bounds (only needed by Absolute Positioning)

        order_table.setPreferredScrollableViewportSize(new Dimension(500 ,50));
        order_table.setFillsViewportHeight(true);


        pane.setBounds(437, 70, 220, 220);
        burger.setBounds (10, 15, 130, 50);
        pizza.setBounds (150, 20, 135, 45);
        SelectedBurger.setBounds (20, 65, 130, 25);
        SelectedPizza.setBounds (150, 65, 135, 25);
        SelectedDrinks.setBounds (285, 65, 125, 25);
        drinks.setBounds (285, 20, 125, 45);
        image.setBounds (20, 100, 390, 160);
        image.setSize(400 , 230);
//        price_txt.setBounds (0, 280, 130, 30);
        return11.setBounds (290, 350, 100, 25);
//        orderrr.setBounds (290, 350, 100, 25);
//        textArea.setBounds (445, 100, 180, 160);
        order_table.setBounds (445, 100, 180, 160);
        orderItems.setBounds (460, 25, 175, 40);
        pay_price.setBounds (520, 300, 115, 25);
        deletee.setBounds (435, 350, 100, 25);
        Order_Items.setBounds (545, 350, 100, 25);
        total_price.setBounds(450, 300, 115, 25);



        Object[] columns = {"ItemName" , "Price"};
        model= new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        order_table.setModel(model);
        order_table.setBackground(Color.black);
        order_table.setForeground(Color.white);
        Font font = new Font("",1,15);
        order_table.setFont(font);
        order_table.setRowHeight(30);


        frame.setSize(700,470);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }



public static ArrayList<String> getDataTable (){


    ArrayList<String> numdata = new ArrayList<String>();

        for(int count=0 ; count<order_table.getRowCount() ; count++){

             String.valueOf(numdata.add((String) model.getValueAt(count, 0)));

        }

      return numdata;
}




    public class mm  implements ActionListener {



        @Override
        public void actionPerformed(ActionEvent e) {

            FOOD foodItems =new FOOD();

            myThread1 t1 = new myThread1(foodItems);

            Errors2 error2 = new Errors2("Items are not selected !!! ");


            if(e.getSource()==SelectedBurger){


                if(SelectedBurger.getSelectedIndex() == 0){

                    error2.setMessage("Please Select The Items !!");
                    error2.getMessage();
                    error2.getMessage();
                    image.setIcon(null);
                    pay_price.setText(null);
                }

                else{


                    foodItems.itemName = (String) SelectedBurger.getSelectedItem();


                    TemplateFood orderFoods = new Burger();


                    String burgerName = (foodItems.itemName + "_image") ;

                    ImageIcon burgers_image = new ImageIcon(orderFoods.orderFood(burgerName));

                    image.setIcon(burgers_image);

                    foodItems.itemPrice = orderFoods.orderFood(foodItems.itemName);

                    t1.run();

                }

            }

            else if(e.getSource()==SelectedPizza){



                if(SelectedPizza.getSelectedIndex() == 0){



                    error2.getMessage();

                    error2.setMessage("Please Select The Items !!");
                    error2.getMessage();

                    image.setIcon(null);
                    pay_price.setText(null);

                }

                else{

                    TemplateFood orderFoods = new Pizza();

                    foodItems.itemName = (String) SelectedPizza.getSelectedItem();

                    String pizzaName = (foodItems.itemName + "_image");

                    ImageIcon Item_Image = new ImageIcon(orderFoods.orderFood(pizzaName));

                    image.setIcon(Item_Image);

                    foodItems.itemPrice = orderFoods.orderFood(foodItems.itemName);
                        t1.run();

                }




            }


            else if(e.getSource() == SelectedDrinks)
            {


                if(SelectedDrinks.getSelectedIndex() == 0){
                    error2.getMessage();

                    error2.setMessage("Please Select The Items !!");
                    error2.getMessage();
                    image.setIcon(null);
                    pay_price.setText(null);
                }


                else {


                    TemplateFood orderFoods = new Drinks();

                    foodItems.itemName = (String) SelectedDrinks.getSelectedItem();

                    ImageIcon Item_image = new ImageIcon(orderFoods.orderFood(foodItems.itemName + "_image"));


                    image.setIcon(Item_image);

                    foodItems.itemPrice = orderFoods.orderFood(foodItems.itemName);

                    t1.run();

                }




            }
            if (e.getSource() == deletee )
            {

                System.out.println("DELTEDDDDDD !!!!!!!!!!");
                myThread3 t3 = new myThread3(foodItems);
                t3.run();


                image.setIcon(null);
                pay_price.setText(null);


            }

            totalAmount Total = new totalAmount();
            myThread2 t2 = new myThread2(Total);

            t2.run();


        }




    }
    public class data implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            Errors errors = new Errors("Items Are Not Selected Please Select Items And then Try Again !!");

            if(SelectedBurger.getSelectedIndex() == 0 && SelectedPizza.getSelectedIndex() == 0 && SelectedDrinks.getSelectedIndex() == 0){


                errors.getErrorMessage();
            }

            else {

                if(e.getSource() == Order_Items){


                    System.out.println(getDataTable());


                    try{
                        ClassNotFoundException.fun();

                        dbQuery runQuery = new dbQuery();

                        runQuery.InsertQuery(runQuery.conn);
                    }

                    catch(Exception | ClassNotFoundException ed){
                        ed.getStackTrace();


                    }





                }



        }


        }
    }



}
