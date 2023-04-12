package homework.ch11_13.p4;

public class AtomicComponent  extends Component {
    public AtomicComponent(){}

    public AtomicComponent(int id, String name, double price){
        setId(id);
        setName(name);
        setPrice(price);
    }

    @Override
    public void add(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't add component to atomic component ");
    }

    @Override
    public void remove(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Can't remove component to atomic component ");
    }

    @Override
    public double calcPrice() {
        return this.price;
    }

    @Override
    public Iterator iterator() {
        return new NullIterator();
    }
}