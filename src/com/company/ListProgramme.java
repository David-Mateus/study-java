package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListProgramme {
    public static void main(String[] args){
        //size of list : size()
        // insert element: add(obj), add(int, obj)
        // remove element of list: remove(obj), remove(int), removeIf(predicate)
        // find position of element: indexOf(obj), lastIndexOf(obj)
        // filter list with base in predicate List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
        // find first with base predicate: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

//        List<String> list = new ArrayList<>();
//
//        list.add("David");
//        list.add("Mateus");
//        list.add("Leite");
//        list.add("Da");
//        list.add("Silva");
//        list.add(2, "SILVA");
//        list.add("Marcos");
//        list.add("Marcelo");
//
//        System.out.println(list.size());
//
//        list.remove("David");
//        for(String name : list){
//            System.out.println(name);
//        }
//        System.out.println("---------------------");
//        list.removeIf(x -> x.charAt(0) == 'S');
//        for(String name : list){
//            System.out.println(name);
//        }
//        // posição de cada um
//        System.out.println("---------------------");
//        System.out.println("Index of Mateus " + list.indexOf("Mateus"));
//        // criar um arrayList com valores filtrados
//        System.out.println("---------------------");
//        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
//        for(String name : result){
//            System.out.println(name);
//        }
//        System.out.println("---------------------");
//        //Primeiro nome
//        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
//        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<Employee2> employeeArrayList = new ArrayList<>();
        for(int i = 0; i < input; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine();
            Employee2 employee = new Employee2(id, name, salary);
            employeeArrayList.add(employee);
        }
        //// find position of element: indexOf(obj), lastIndexOf(obj)
        System.out.println("Enter the employee id that will have salary increase: ");
        int searchIdEmployee = sc.nextInt();
        Integer findPos = employeeArrayList.indexOf(searchIdEmployee);
        if(findPos != null){
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employeeArrayList.get(findPos).setSalary(percentage);
        }else{
            System.out.println("This id does not exist");
        }


        for(Employee2 employee : employeeArrayList ){
            System.out.println(employee.toString());
        }
    }
}
