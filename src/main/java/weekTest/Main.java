package weekTest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] records = input.trim().split(",");

        Map<String, List<String>> departmentEmployeesMap = new HashMap<>();

        for (int i = 0; i < records.length; i += 2) {
            String department = records[i].trim();
            String employee = records[i + 1].trim();

            departmentEmployeesMap.computeIfAbsent(department, k -> new ArrayList<>()).add(employee);
        }

        departmentEmployeesMap.forEach((key, value) -> System.out.println(key + " = " + String.join(",", value)));
    }
}
