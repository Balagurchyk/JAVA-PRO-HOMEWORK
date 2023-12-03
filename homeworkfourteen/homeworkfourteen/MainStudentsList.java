package com.proftelran.org.homeworkfourteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStudentsList {

//    Есть родительский класс Student, есть три дополнительных класса, которые разделяют студентов на три группы :
//    FrontEndStudent,BackEndStudent,QAStudent.
//
//            (поля классов String name, double rate, boolean finished, ClassType type(Enum вида BA,FE,QA) -
//            оставить пустым при создании студента)
//
//    Сформировать три списка, в каждом по 5 студентов каждого направления,
//    Поместить все три списка в один список-списков. Для этого потребуется установить взаимоотношения между 4!
//    классами указанными выше, что бы можно было с данными классами работать в едином стиле.(те тип объектов в
//    списке должен быть Student,классы должны быть его наследниками)
//
//    Создать класс ProjectStudent с полями (String name,double rate, ClassType type(Enum вида BA,FE,QA))
//            (объекты данного класса будут создаваться в стриме)
//
//    Начало одного стрима :
//
//    Написать стрим для данного списка - списков, в котором выбрать всех студентов с рейтом более 4.5 и тех,
//    кто закончил курс (поле finished), для каждого студента который попал под условие, в поле type установить
//    значение типа FE,BE,QA в зависимости от того к какому типу класса он относится(используйте instanceof),
//    далее - переформировать всех получившихся студентов в объекты класса ProjectStudent (данные в поля вставить
//    из данных студента),(теперь в этой точке должен быть стрим студентов ProjectStudent), вывести всю информацию
//    о получившихся студентах в консоль, после - собрать данные в отдельный список.
//
//    Конец одного и того же стрима.



    public static void main(String[] args) {
        List<List<Student>> studentsList = Arrays.asList(
                Arrays.asList(
                        new FrontEndStudent("Ivan", 4.7, false),
                        new FrontEndStudent("Max", 4.3, true),
                        new FrontEndStudent("Oleg", 4.8, true),
                        new FrontEndStudent("Petr", 4.2, false),
                        new FrontEndStudent("Sergey", 4.5, true)
                ),
                Arrays.asList(
                        new BackEndStudent("Viktor", 4.9, true),
                        new BackEndStudent("Stepan", 4.1, false),
                        new BackEndStudent("Denis", 4.4, true),
                        new BackEndStudent("Egor", 4.8, true),
                        new BackEndStudent("Vlad", 4.9, false)
                ),
                Arrays.asList(
                        new QAStudent("Marta", 4.8, true),
                        new QAStudent("Lera", 4.6, false),
                        new QAStudent("Vera", 4.2, false),
                        new QAStudent("Olga", 4.1, true),
                        new QAStudent("Dasha", 4.8, true)
                )
        );
        List<ProjectStudent> result = studentsList.stream()
                .flatMap(newList -> newList.stream())
                .filter(student -> student.rate > 4.5 && student.finished)
                .peek(student -> {
                            if (student instanceof FrontEndStudent) {
                                student.type = ClassType.FE;
                            } else if (student instanceof BackEndStudent) {
                                student.type = ClassType.BA;
                            } else if (student instanceof QAStudent) {
                                student.type = ClassType.QA;
                            }
                        }
                )
                .map(student -> new ProjectStudent(student.name, student.rate, student.type))
                .peek(projectStudent -> System.out.println
                        ("Закончил курс с высоким рейтом: " + projectStudent.name + ", "
                                + projectStudent.rate + ", " + projectStudent.type))
                .collect(Collectors.toList());

        System.out.println("Список ProjectStudent:");
        result.forEach(projectStudent -> System.out.println(projectStudent.name + ", " + projectStudent.rate + ", " + projectStudent.type));
    }
}
