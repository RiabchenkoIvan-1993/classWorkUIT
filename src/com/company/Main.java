package com.company;


import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Main {

    /*HashSet<String> a = new HashSet<String>() {{
        add("45sdf");
        add("45sdf");
        add("45sdf");
    }};
    static HashSet<String> b = new HashSet<String>();

    static {
        b.add("45sdf");
        b.add("45sdf");
        b.add("45sdf");
    }*/

    /*ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("1", "fd", "5"));
    static HashSet<String> v = new HashSet<>(new ArrayList<>(Arrays.asList("1", "fd", "5", "5")));
*/
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
         MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
        out.println("Thread 1"+myThread.isAlive());
        out.println("Thread 1"+myThread1.isAlive());
        myThread.join();
        myThread1.join();
        out.println("Thread 1"+myThread.isAlive());
        out.println("Thread 1"+myThread1.isAlive());
        /*new Thread(()->{Thread thread1 = Thread.currentThread();
            out.println("ID = " + thread1.getId());
            out.println("Name = " + thread1.getName());
            out.println("Priority = " + thread1.getPriority());
            out.println("State = " + thread1.getState());}).start();
        new Thread(()->{Thread thread1 = Thread.currentThread();
            out.println("ID = " + thread1.getId());
            out.println("Name = " + thread1.getName());
            out.println("Priority = " + thread1.getPriority());
            out.println("State = " + thread1.getState());}).start();*/

        /*Stream<Date> stream =Stream.generate(() -> {return new Date();}).limit(10);
        final List<Date> collect = stream.collect(Collectors.toList());
        out.println(collect);*/

        /*Stream.of("a1","a2","a3")
                .map(s->s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(out::println);

        IntStream.range(1,4)
                .mapToObj(i->"a"+i)
                .forEach(out::println);*/

        /*List<String> myList = Arrays.asList("a1", "a2", "b1", "b2", "c1", "c2");
myList
        .stream()
        .filter(s->s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(out::println);*/
        //        EnumSet<Faculty> set1 = EnumSet.range(Faculty.MMF,Faculty.GEO);

        /*TreeMap<String, Double> hm = new TreeMap<>();
        hm.put("Joe",new Double(53051.2));
        hm.put("Ivan",new Double(3078.2));
        hm.put("Bill",new Double(34551.2));

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            out.print(me.getKey()+": ");
            out.println(me.getValue());
        }
        out.println();
        double balance=hm.get("Joe");
        hm.put("Joe", balance + 1000);
        out.println("joes new balance: "+hm.get("Joe"));*//*

        ArrayList<Girl> girls = new ArrayList<Girl>();
        girls.add(new Girl("Ira",45));
        girls.add(new Girl("Hua",45));
        girls.add(new Girl("Ira",12));
        ArrayList<Girl> girls1 = new ArrayList<Girl>();
        girls.add(new Girl("Ira",45));
        girls.add(new Girl("Tua",45));
        girls.add(new Girl("Mra",12));
        out.println(girls);
        out.println(girls1);
        out.println(Collections.disjoint(girls1, girls));
        out.println( Collections.frequency(girls,new Girl("Ira",45)));
        out.println( Collections.min(girls));*/

//        Collection<Girl> girls1 = Collections.unmodifiableCollection(girls);
//        girls1.add(new Girl("Iradddd",142));
//        out.println(girls1);
//        Collections.reverse(girls);
//        out.println(girls);
//        Collections.shuffle(girls);
//        out.println(girls);
        /*ArrayList<String> strings = new ArrayList<>();
        strings.add("asfwef");
        strings.add("www");
        strings.add("eee");
        strings.add("qq");
        strings.add("ee");
        strings.add("rr");
        out.println("Contains os strings:" + strings);
Iterator<String> itr =strings.iterator();
        while (itr.hasNext()) {
             String element = itr.next();
            out.print(element+"");
        }
        out.println();

        ListIterator<String> litr=strings.listIterator();

        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element+"+");
        }

        out.println("Modified");
        itr=strings.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            out.print((element + " "));
        }
        out.println();
        out.println("Modified backwards:");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            out.print((element + " "));
        }*/


        //        out.println(v);

        /*final LinkedList<String> strings = new LinkedList<>();
        out.println("Init size:" + strings.size());
        strings.add("asfwef");
        strings.add("www");
        strings.add("eee");
        strings.add("qq");
        strings.add("ee");
        strings.add("rr");

        out.println("Size of al after addition:" + strings.size());

        out.println("Contains os strings:" + strings);

        strings.removeLast();
        strings.remove(2);
        strings.remove("www");

        out.println("Size of al after deletion:" + strings.size());

        out.println("Contains os strings:" + strings);*/

        /*final TreeSet<Girl> girls = new TreeSet<>();
//        girls.add(null);
        girls.add(new Girl("ffd",21));
        girls.add(new Girl("ffd",28));
        girls.add(new Girl("ffd",26));
        girls.add(new Girl("ffd",26));

        out.println(girls);*/
        /*final MyMinMax<String> stringMyMinMax = new MyMinMax<String>(new String[]{"b", "e", "fd"});
        out.println(stringMyMinMax.min());
        out.println(stringMyMinMax.max());
        final MyMinMax<Integer> intMyMinMax = new MyMinMax<Integer>(new Integer[]{5, 8, -123});
        out.println(intMyMinMax.min());
        out.println(intMyMinMax.max());
        final MyMinMax<Girl> GirlMyMinMax = new MyMinMax<Girl>(new Girl[]{new Girl("Ket",20), new Girl("Ira",25), new Girl("Sveta",23)});
        out.println(GirlMyMinMax.min());
        out.println(GirlMyMinMax.max());*/

        /*Integer nums[]={1,5,2,4,1};

        if (GenMethDemo.isIn(2,nums)) {
            out.println("2 is in nums");
        }
        if (!GenMethDemo.isIn(7,nums)) {
            out.println("7 is not in nums");
        }

        String strings[]={"rt","a","asdfasdf"};

        if (GenMethDemo.isIn("a",strings)) {
            out.println("a is in strings");
        }
        if (!GenMethDemo.isIn("sdsd",nums)) {
            out.println("s is not in strings");
        }*/

        /*My my = new My<Integer>(new Integer[]{1, 2, 5, 1, 2});
        out.println(my.getType());
        out.println(my.getAVG());
        My my1 = new My<Float>(new Float[]{1.0F, 2.2F, 5.2F, 1F, 2F});
        out.println(my1.getType());
        out.println(my1.getAVG());
        out.println(my.avg(my1));
        My<?>[] mies = new My<?>[5];
        */

        /*Student goncharenko = new Student("ttt","goncharenko",1,"123456");
        out.println(goncharenko);

         File file = new File("demo.dat");
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
         objectOutputStream.writeObject(goncharenko);
         objectOutputStream.close();

         Student.faculty="nnn";
         File file1 = new File("demo.dat");
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file1));
         Student unknown = (Student) objectInputStream.readObject();
        out.println(unknown);*/
        /*Path path= Paths.get("text.txt");
        Files.delete(path);*/
        //
        // Files.move(Paths.get("src/2"),path, StandardCopyOption.REPLACE_EXISTING);
        //List<String> li= Files.readAllLines(path);
        //out.println(li);


        /*try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("text.txt"))) {
            dout.writeDouble(98.2);
            dout.writeInt(98);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            out.println("Cant open file1");
            return;
        } catch (IOException e) {
            out.println("IO error" + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("text.txt"))) {
            double d = din.readDouble();
            boolean b = din.readBoolean();
            int i = din.readInt();
            out.println("Values: " + d + " " + i + " " + b);

        } catch (FileNotFoundException e) {
            out.println("Cant open file2");
            return;
        } catch (IOException e) {
            out.println("IO error" + e);
        }*/

        /*RandomAccessFile raf = new RandomAccessFile("text.txt","rw");

        out.println(raf.length());
        raf.seek(10);

        String s = raf.readLine();
        out.println(s);
        raf.seek(raf.length());
        raf.writeUTF("jopf");
        raf.close();*/

       /*InputStream inFile = new FileInputStream("text.txt");
        readFullyByBite(inFile);
        out.println("\n\n\n");

        InputStream inURL = new URL("http://google.com").openStream();
        readFullyByBite(inURL);
        out.println("\n\n\n");*/

        /*InputStream inArray = new ByteArrayInputStream(new byte[]{-1,-66,25,54,64,59,45,51});
        readFullyByBite(inArray);
        out.println("\n\n\n");*/


        /*BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        PrintWriter write = new PrintWriter("out.txt");
        String s =null;
        int words=0;
        int lines=0;
        int chars=0;
        while ((s=reader.readLine())!=null) {
            lines++;
            String[] ws = s.trim().split("\\s");
            words+=ws.length;
            for (String w : ws) {
                chars+=w.length();
                write.println(s.toUpperCase());
            }
        }
        reader.close();
        write.close();
        out.printf("Copied - %d; words - %d; strings - %d",chars,words,lines);*/


        /*FileInputStream st = new FileInputStream("text.txt");
        out.println("Potoki");
        while (st.available() != 0) {
            int b = st.read();
            char ch = (char) b;
            out.print(ch);
        }
        st.close();

        FileOutputStream so = new FileOutputStream("out.txt");
        String d = "Hi";
        byte[] bytes = d.getBytes();
        so.write(bytes);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        String s = null;
        out.print("BuferReadsr");
        while ((s = reader.readLine()) != null) {
            out.println(s);
        }
        reader.close();
        PrintWriter write = new PrintWriter("out1.txt");
        write.printf("%s %d %c", "String", 100, 'Ё');
        write.close();*/
//        Formatter f = new Formatter();
//        Calendar cal = Calendar.getInstance();
//        f.format("%tr",cal);
//        System.out.println(f);
//        f= new Formatter();
//        f.format("%tc",cal);
//        System.out.println(f);
//        f= new Formatter();
//        f.format("%tl:%tM",cal,cal);
//        System.out.println(f);
//        f= new Formatter(Locale.CHINA);
//        f.format("%tB %tb %tm",cal,cal,cal);
//        System.out.println(f);


//        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
//        Date d= null;
//        String str = "April 9, 2012";
//        try {
//            d=dateInstance.parse(str);
//            System.out.println(d);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        dateInstance=DateFormat.getDateInstance(DateFormat.FULL, new Locale("ru","RU"));
//        System.out.println(dateInstance.format(d));
//        dateInstance=DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
//        System.out.println(dateInstance.format(d));

//        NumberFormat nfGe=NumberFormat.getInstance(Locale.GERMAN);
//        NumberFormat nfUs=NumberFormat.getInstance(Locale.US);
//        NumberFormat nfFr=NumberFormat.getInstance(Locale.FRANCE);
//        double iGe=0, iUS=0, iFr=0;
//        String str ="1.254,5";
//        try {
//            iGe = nfGe.parse(str).doubleValue();
//            iUS = nfUs.parse(str).doubleValue();
//            iFr = nfFr.parse(str).doubleValue();
//
//        } catch (ParseException e) {
//            System.out.println("Parse error");
//        }
//        System.out.printf("iGe=%f\niUs=%f\niFr=%f",iGe,iUS,iFr);
//        String sUs=nfUs.format(iGe);
//        String sFr=nfFr.format(iGe);
//        System.out.println("\nUs"+sUs+"\nFr"+sFr);

//        StringBuffer stringBuffer = new StringBuffer("55GGG 5651 fmm D kml;4ca;sjndfbbb");
//
//        stringBuffer.deleteCharAt(5);

//        System.out.println(Pattern.compile(":")
//                .splitAsStream("foobar:foo:bar")
//                .filter(s -> s.contains("bar"))
//                .sorted()
//                .collect(Collectors.joining(":")));
//
//        Pattern pattern=
//                Pattern.compile(".*@gmail\\.com");
//
//        System.out.println(Stream.of("bob@gmail.com,alise@hotmail.com").filter(pattern.asPredicate()).count());
    }

    private static void readFullyByBite(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                out.print(oneByte);
            } else {
                out.println("\n" + "end");
                break;
            }
        }
    }

    private static void getFinaly() {
        out.println("finaly");
    }
}