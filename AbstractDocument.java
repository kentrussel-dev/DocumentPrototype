abstract class AbstractDocument implements Document {
    @Override
    public Document clone() {
        Document clone = null;
        try {
            clone = (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}