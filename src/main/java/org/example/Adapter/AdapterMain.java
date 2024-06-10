package org.example.Adapter;

public class AdapterMain {

    public static void main(String[] args) {
        /** Class Adapter **/
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("/***********/");

        /** Object Adapter **/
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee){
        employee.setFullName("Turan Öztürk");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Bilkent");
    }

}
