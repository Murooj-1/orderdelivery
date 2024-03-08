/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderdelivery;


/**
 *
 * @author
 */
public class Report {
    int numOfOrders;
    ArrayStack orderHistory= new ArrayStack<>();
    BinaryTree ORDERS = new BinaryTree();
    DriverInformation DeliveryWorker = new DriverInformation();
    ListOfInformation ListOfInformation;
    /**
     *
     */
    public Report() {
        
    }
    public Report(ListOfInformation listOfInformation) {
      ListOfInformation =listOfInformation;  
    }
    
    /**
     *
     * @return
     */
    public int getNumOfOrders() {
        return numOfOrders;
    }

    /**
     *
     * @param numOfOrders
     */
    public void setNumOfOrders(int numOfOrders) {
        this.numOfOrders = numOfOrders;
    }

    /**
     *
     * @return
     */
    public ArrayStack getOrderHistory() {
        return orderHistory;
    }

    /**
     *
     * @param orderHistory
     */
    public void setOrderHistory(ArrayStack orderHistory) {
        this.orderHistory = orderHistory;
    }

    /**
     *
     * @return
     */
    public BinaryTree getORDERS() {
        return ORDERS;
    }

    /**
     *
     * @param ORDERS
     */
    public void setORDERS(BinaryTree ORDERS) {
        this.ORDERS = ORDERS;
    }

    /**
     *
     * @return
     */
    public DriverInformation getDeliveryWorker() {
        return DeliveryWorker;
    }

    /**
     *
     * @param DeliveryWorker
     */
    public void setDeliveryWorker(DriverInformation DeliveryWorker) {
        this.DeliveryWorker = DeliveryWorker;
    }
    
    /**
     *
     * @param order
     */
    public void pushOrder(OrderService order){
        orderHistory.push(order);  
        numOfOrders++;
    }  
     /**
     * this method allows the user to view his orders history via orders' invoices
     * 
     */
    
    public void getOrdersHistory(){
        if (numOfOrders >= 1){
          System.out.println("Order History: "); 
          System.out.println (orderHistory.toString());
    }
    }

    /**
     *
     * @param store
     */
  public void TheMostRequested(Store[] store) {
        System.out.println(store[0] + "                     number of orders = " + store[0].getStarincrementStore());

        System.out.println(store[1] + "                     number of orders = " + store[1].getPandincrementStore());

        System.out.println(store[2] + "                     number of orders = " +  store[2].getNahdincrementStore());

        System.out.println(store[3] + "                     number of orders = " + store[3].getNeamincrementStore());

        System.out.println(store[4] + "                     number of orders = " + store[4].getMacincrementStore());

    }

    /**
     *
     * @param i
     */
    public void NewestAndOldest(int i){
        
        if (!(orderHistory.isEmpty())){
        System.out.println("["+i+"] "+orderHistory.pop());
        NewestAndOldest(i+1);
        }
        
    }
    
    /**
     *
     * @param store
     */
    public void CreatReport(Store[] store){
        System.out.println(" ____________________________________________________________________________________________");
        System.out.println("|                                    R  E  P  O  R  T                                        |");
        System.out.println("|____________________________________________________________________________________________|");
        System.out.println("\n\n NUMBER OF ORDERES IN THE SYSTEM : "+(ORDERS.getSize()));
        System.out.println("\n\n ARRANGE ORDERS FROM NEWEST TO OLDEST : ");
        NewestAndOldest(1);
        System.out.println("\n\n Orders Per Store : ");
        TheMostRequested(store);
        DeliveryWorker.Driversٌeport(ListOfInformation);


    }

  

}

