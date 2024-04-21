package com.yourOrganization.gitworkflow;

public class GitWorkFlow {
    public static void main (String[] args) {
        String step1 = "step1: Deschizi IntelliJ Idea. ";
        String step2 = "step2: Acesezi linia de comandă și te asiguri că nu ai schimbări care nu au fost încărcate în memoria locală, pentru asta execută git stash. (Dacă ai schimbări, ele vor fi stocate, dar nu commit-uite). ";
        String step3 = "step3: Transferă-te pe ramura de bază, pentru asta execut git checkout master.  ";
        String step4 = "step4: Asigură-te că ai ultima versiune cloud inclusiv în memoria locală git, pentru asta execută: git fetch și git pull, în rezultat ultimile schimbări care sunt pe ramura principală origin/master vor fi descărcate local. ";
        String step5 = "step5: Creează o nouă ramură git, fiind pe cea mai recentă versiune de master, pentru asta execută git checkout –b Nume_ramură. Această comandă va crea o nouă ramură și te va transfera pe aceasta. ";
        String step6 = "step6: Adaugă schimbările necesare și încarcăle în memoria locală, făcând un git commit (utilizează consola IntelliJ Idea).  ";
        String step7 = "step7: Odată ce modificările au fost stocate cu ajutorul la commit, încarcăle pe cloud, executând git push pe un branch cu același nume ca și ramura locală: origin/Nume_ramură ";
        String step8 = "step8: Odată ce ai făcut git push, navighează la contul tău cloud de GitHub și identifică noua ramură. ";
        String step9 = "step9: Acesează noua ramură și creează un Pull Request (Cerere de concatenare).  ";
        String step10 = "step10: Solicită aprobarea colegilor. ";
        String step11 = "step11: Dacă ai comentarii care trebui modificate, revină la IntelliJ Idea și execută schimbările, după care execută git commit ammend, urmat de către git push –f. ";
        String step12 = "step12: Odată ce ai cel puțin o aprobare, poți face concatenarea cu succes. Schimbările de pe origin/Nume_ramură vor fi conectate la ramura principală origin/master.  ";
        String step13 = "step13: Important, ramura master din memoria locală git nu conține ultimile modificări, pentru asta trebuie să revii la IntelliJ Idea, să navighezi la ramura master și să descarci ultimile modificări: git checkout master, git fetch, git pull. ";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
    }
}
