public class Story {
	private Situation start_story;
    public Situation current_situation;
 
    Story() {
    	
        start_story = new Situation(
                "жилище",
                "¬ы можете выбрать место проживани€\n"
                        + "(1)уползете от всех в сельскую местность\n"
                        + "(2)будете тусить в центре города\n"
                        + "(3)поседитесь в спальном районе",
                3, 0, 0, 0);
        
        start_story.direction[0] = new Situation(
                "смерть",
                "Ќеудачное начало, вас скушала, пролетающа€ птичка!",
                0, 0, 0, 0);
        
        start_story.direction[1] = new Situation(
                "центр города",
                "Ќу что, с жильем определились,"
                        + "теперь нужно подумать о работе\n"
                		+ "(1)погуглить вакансии\n"
                        + "(2)дать объ€вление в газете\n"
                        + "(3)попытатьс€ раскрутить свою страничку в ”литкограме",
                0, 0, 0, 0);
        
        				/*start_story.direction[1].direction[0] = new Situation(
        							"поиск работы",
        							"¬ам повезло, теперь вы успещный фрилансер",
        							0, 0, 0, 0);
        				current_situation = start_story;
        
        				start_story.direction[1].direction[1] = new Situation(
        							"поиск работы",
        							"”вы, ваше развитие отстает даже за улитками\n"
        							+"¬ы опустились на дно и спились",
        							0, 0, 0, 0);
        				current_situation = start_story;

        				start_story.direction[1].direction[2] = new Situation(
        						"поиск работы",
        						"¬ам повезло, теперь вы успещный фрилансер",
        						0, 0, 0, 0);
        				current_situation = start_story;*/

        start_story.direction[2] = new Situation(
                "мой первый ло€льный клиент",
                "ћой первый клиент доволен скоростью и качеством "
                        + "моей работы. —ейчас мне звонил лично \nдиректор компании,  сообщил что скоро состоитс€ еще более крупна€ сделка"
                        + " и он хотел, чтобы по ней работал именно €!",
                        0, 0, 0, 0);
        //еще одна веточка
         /*start_story.direction[2].direction[0] = new Situation(
                "11мой первый ло€льный клиент",
                "ћой первый клиент доволен скоростью и качеством "
                        + "моей работы. —ейчас мне звонил лично \nдиректор компании,  сообщил что скоро состоитс€ еще более крупна€ сделка"
                        + " и он хотел, чтобы по ней работал именно €!", 0, 0,
                50, 1);
        current_situation = start_story;*/
    }
 
    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("¬ы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }
 
    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
