package homework.ch11_13.p4;


public class CompositeComponent extends Component{
    protected ComponentList childs = new ComponentList();
    public CompositeComponent(){

    }
    public CompositeComponent(int id, String name, double price){
        setId(id);
        setName(name);
        setPrice(price);
        setPrice(calcPrice());
    }
    @Override
    public void add(Component component) throws UnsupportedOperationException {
        if (childs.contains(component)) {
            return;
        }
        childs.add(component);
        calcPrice();
    }
    @Override
    public void remove(Component component) throws UnsupportedOperationException {
        if (childs.contains(component)) {
            childs.remove(component);
            calcPrice();
        }
    }

    @Override
    public double calcPrice(){
        double total=0;
        for (Component child : childs) {
            total += child.getPrice();
        }
        setPrice(total);
        return total;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("id: " + getId() + ", name: " + getName() + ", price: " + getPrice() + '\n');
        s.append("sub-components of ").append(getName()).append(":\n");
        for (Component child : childs) {
            s.append(child.toString());
        }
        return s.toString();
    }

    public Iterator iterator(){
        return new CompositeIterator(childs);
    }
}

