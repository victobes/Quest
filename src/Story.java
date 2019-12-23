public class Story {
	private Situation start_story;
    public Situation current_situation;
 
    Story() {
    	
        start_story = new Situation(
                "������",
                "�� ������ ������� ����� ����������\n"
                        + "(1)�������� �� ���� � �������� ���������\n"
                        + "(2)������ ������ � ������ ������\n"
                        + "(3)���������� � �������� ������",
                3, 0, 0, 0);
        
        start_story.direction[0] = new Situation(
                "������",
                "��������� ������, ��� �������, ����������� ������!",
                0, 0, 0, 0);
        
        start_story.direction[1] = new Situation(
                "����� ������",
                "�� ���, � ������ ������������,"
                        + "������ ����� �������� � ������\n"
                		+ "(1)��������� ��������\n"
                        + "(2)���� ���������� � ������\n"
                        + "(3)���������� ���������� ���� ��������� � �����������",
                0, 0, 0, 0);
        
        				/*start_story.direction[1].direction[0] = new Situation(
        							"����� ������",
        							"��� �������, ������ �� �������� ���������",
        							0, 0, 0, 0);
        				current_situation = start_story;
        
        				start_story.direction[1].direction[1] = new Situation(
        							"����� ������",
        							"���, ���� �������� ������� ���� �� ��������\n"
        							+"�� ���������� �� ��� � �������",
        							0, 0, 0, 0);
        				current_situation = start_story;

        				start_story.direction[1].direction[2] = new Situation(
        						"����� ������",
        						"��� �������, ������ �� �������� ���������",
        						0, 0, 0, 0);
        				current_situation = start_story;*/

        start_story.direction[2] = new Situation(
                "��� ������ �������� ������",
                "��� ������ ������ ������� ��������� � ��������� "
                        + "���� ������. ������ ��� ������ ����� \n�������� ��������,  ������� ��� ����� ��������� ��� ����� ������� ������"
                        + " � �� �����, ����� �� ��� ������� ������ �!",
                        0, 0, 0, 0);
        //��� ���� �������
         /*start_story.direction[2].direction[0] = new Situation(
                "11��� ������ �������� ������",
                "��� ������ ������ ������� ��������� � ��������� "
                        + "���� ������. ������ ��� ������ ����� \n�������� ��������,  ������� ��� ����� ��������� ��� ����� ������� ������"
                        + " � �� �����, ����� �� ��� ������� ������ �!", 0, 0,
                50, 1);
        current_situation = start_story;*/
    }
 
    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("�� ������ �������� �� "
                    + current_situation.direction.length + " ���������");
    }
 
    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
