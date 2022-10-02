import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

    public static void main(String[] args) {
        String[] names = {
            "Joao", "Maria", "Fabio", "Alan", "Vitor",
            "Tiago", "Vitoria", "Manu", "Marcos", "Vitor",
            "Alexandre", "Joel", "Adriano"
        };
        boolean[] inClass = {
            false, true, true, false, true,
            true, false, true, true, false,
            true, true, true
        };

        ArrayList<Student> listStudents = new ArrayList<Student>();
        ArrayList<Groups> listGroups = new ArrayList<Groups>();
        int idGroup = 1;
        int sizeList;

        for (int i = 0; i < names.length; i++) {
            if (inClass[i]) {                
                listStudents.add(new Student(names[i]));
            }
        }

        Collections.shuffle(listStudents);
        sizeList = listStudents.size();

        if (sizeList % 2 == 0) {
            for (int i = 0; i < sizeList; i++) {
                listGroups.add(new Groups(idGroup, listStudents.get(i).getName(), listStudents.get(sizeList - 1).getName()));
                sizeList--;
                idGroup++;
            }

            System.out.println("ID - ALUNO_1 - ALUNO_2");
            listGroups.stream().forEach(group -> System.out.println(group.getId() + " - " + group.getFirstStudent() + " - " + group.getSecondStudent()));

        } else {
            for (int i = 0; i < sizeList; i++) {
                
                if (i == 0) {
                    listGroups.add(
                        new Groups(
                            idGroup, listStudents.get(i).getName(),
                            listStudents.get(i+1).getName()
                        )
                    );

                    listGroups.get(i).setThridStudent(listStudents.get(sizeList - 1).getName());

                    sizeList--;
                    idGroup++;
                    i = 2;
                }

                listGroups.add(new Groups(idGroup, listStudents.get(i).getName(), listStudents.get(sizeList - 1).getName()));
                sizeList--;
                idGroup++;
            }

            boolean firstRun = true;

            for (Groups group : listGroups) {

                if (firstRun) {
                    System.out.println("ID - ALUNO_1 - ALUNO_2 - ALUNO_3");
                    System.out.println(group.getId() + " - " + group.getFirstStudent() + " - " + group.getSecondStudent() + " - " + group.getThridStudent());

                    firstRun = false;
                } else {
                    System.out.println(group.getId() + " - " + group.getFirstStudent() + " - " + group.getSecondStudent());
                }                
            }
        }

    }
}