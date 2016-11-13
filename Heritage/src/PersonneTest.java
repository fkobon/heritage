import java.util.ArrayList;

public class PersonneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Personne>tab=new ArrayList<Personne>();
tab.add(new Homme("sassi","walid",50));
tab.add(new Homme("sassi","mohamed",30));
tab.add(new Femme("sassi","yakine",34));
tab.add(new Homme("sassi","yahya",70));
for (Personne p:tab)
{
	p.afficher();
}

	}

}
