package homework.ch11_13.p4;

import java.util.ArrayList;


public class ComponentList extends ArrayList<Component> implements Iterator{
    private int position = 0;
    public ComponentList(){}
    @Override
    public boolean hasNext() {
            return position < this.size();
    }

    @Override
    public Component next() {
        if(hasNext()){
            Component c = this.get(position);
            position++;
            return c;
        }
        return null;
    }
}