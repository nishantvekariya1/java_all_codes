//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.TreeSet;
//
//public class MyLift {
//    public static void main(String[] args) {
//        System.out.println("Welcome to MyLift");
//
//        // RequestListenerThread to read requested floor and add to Set
//        Thread requestListenerThread = new Thread(new RequestListener(), "RequestListenerThread");
//
//        // RequestProcessorThread to read Set and process requested floor
//        Thread requestProcessorThread = new Thread(new RequestProcessor(), "RequestProcessorThread");
//
//        Elevator1.getInstance().setRequestProcessorThread(requestProcessorThread);
//        requestListenerThread.start();
//        requestProcessorThread.start();
//    }
//}
//
//class Elevator1 {
//
//    private static Elevator1 Elevator1 = null;
//
//    private TreeSet requestSet = new TreeSet();
//
//    private int currentFloor = 0;
//
//    private Direction direction = Direction.UP;
//
//    private Elevator1() {};
//
//    private Thread requestProcessorThread;
//
//    /**
//     * @return singleton instance
//     */
//    static Elevator1 getInstance() {
//        if (Elevator1 == null) {
//            Elevator1 = new Elevator1();
//        }
//        return Elevator1;
//    }
//
//    /**
//     * Add request to Set
//     *
//     * @param f
//     */
//    public synchronized void addFloor(int f) {
//        requestSet.add(f);
//
//        if(requestProcessorThread.getState() == Thread.State.WAITING){
//            // Notify processor thread that a new request has come if it is waiting
//            notify();
//        }else{
//            // Interrupt Processor thread to check if new request should be processed before current request or not.
//            requestProcessorThread.interrupt();
//        }
//
//    }
//
//    /**
//     * @return next request to process based on Elevator1 current floor and direction
//     */
//    public synchronized int nextFloor() {
//
//        Integer floor = null;
//
//        if (direction == Direction.UP) {
//            if (requestSet.ceiling(currentFloor) != null) {
//                floor = (Integer) requestSet.ceiling(currentFloor);
//            } else {
//                floor = (Integer)requestSet.floor(currentFloor);
//            }
//        } else {
//            if (requestSet.floor(currentFloor) != null) {
//                floor = (Integer)requestSet.floor(currentFloor);
//            } else {
//                floor = (Integer)requestSet.ceiling(currentFloor);
//            }
//        }
//        if (floor == null) {
//            try {
//                System.out.println("Waiting at Floor :" + getCurrentFloor());
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        } else {
//            // Remove the request from Set as it is the request in Progress.
//            requestSet.remove(floor);
//        }
//        return (floor == null) ? -1 : floor;
//    }
//
//    public int getCurrentFloor() {
//        return currentFloor;
//    }
//
//    /**
//     * Set current floor and direction based on requested floor
//     *
//     * @param currentFloor
//     * @throws InterruptedException
//     */
//    public void setCurrentFloor(int currentFloor) throws InterruptedException {
//        if (this.currentFloor > currentFloor) {
//            setDirection(Direction.DOWN);
//        } else {
//            setDirection(Direction.UP);
//        }
//        this.currentFloor = currentFloor;
//
//        System.out.println("Floor : " + currentFloor);
//
//        Thread.sleep(3000);
//    }
//
//    public Direction getDirection() {
//        return direction;
//    }
//
//    public void setDirection(Direction direction) {
//        this.direction = direction;
//    }
//
//    public Thread getRequestProcessorThread() {
//        return requestProcessorThread;
//    }
//
//    public void setRequestProcessorThread(Thread requestProcessorThread) {
//        this.requestProcessorThread = requestProcessorThread;
//    }
//
//    public TreeSet getRequestSet() {
//        return requestSet;
//    }
//
//    public void setRequestSet(TreeSet requestSet) {
//        this.requestSet = requestSet;
//    }
//
//}
//
//class RequestProcessor implements Runnable {
//
//    @Override
//    public void run() {
//        while (true) {
//            Elevator1 Elevator1 = Elevator1.getInstance();
//            int floor = Elevator1.nextFloor();
//            int currentFloor = Elevator1.getCurrentFloor();
//            try{
//                if (floor >= 0) {
//                    if (currentFloor > floor) {
//                        while (currentFloor > floor) {
//                            Elevator1.setCurrentFloor(--currentFloor);
//                        }
//                    } else {
//                        while (currentFloor < floor) {
//                            Elevator1.setCurrentFloor(++currentFloor);
//                        }
//                    }
//                    System.out.println("Welcome to Floor : " + Elevator1.getCurrentFloor());
//                }
//
//            }catch(InterruptedException e){
//                // If a new request has interrupted a current request processing then check -
//                // -if the current request is already processed
//                // -otherwise add it back in request Set
//                if(Elevator1.getCurrentFloor() != floor){
//                    Elevator1.getRequestSet().add(floor);
//                }
//            }
//        }
//    }
//}
//
//class RequestListener implements Runnable {
//
//    @Override
//    public void run() {
//
//        while (true) {
//            String floorNumberStr = null;
//            try {
//                // Read input from console
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//                floorNumberStr = bufferedReader.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            if (isValidFloorNumber(floorNumberStr)) {
//                System.out.println("User Pressed : " + floorNumberStr);
//                Elevator1 Elevator1 = Elevator1.getInstance();
//                Elevator1.addFloor(Integer.parseInt(floorNumberStr));
//            } else {
//                System.out.println("Floor Request Invalid : " + floorNumberStr);
//            }
//        }
//    }
//
//    /**
//     * This method is used to define maximum floors this Elevator1 can process.
//     * @param s - requested floor
//     * @return true if requested floor is integer and upto two digits. (max floor = 99)
//     */
//    private boolean isValidFloorNumber(String s) {
//        return (s != null) && s.matches("\\d{1,2}");
//    }
//
//}
//
//enum Direction {
//    UP, DOWN
//}