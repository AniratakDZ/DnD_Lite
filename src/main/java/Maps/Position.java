package Maps;
public class Position extends Object {

    private int m_x = 0;
    private int m_y = 0;

    public Position(int x, int y) {
        m_x = x;
        m_y = y;
    }

    public int getX() {
        return m_x;
    }
    public int getY() {
        return m_y;
    }
    @Override
    public boolean equals(Object obj) {
        // System.out.println("equals aufruf");
        if(obj instanceof Position) {
            Position tmp = (Position) obj;
            // System.out.println("equals: " + ((tmp.getX() == m_x) && (tmp.getY() == m_y)));
            return (tmp.getX() == m_x) && (tmp.getY() == m_y);
        }
        return false;
    }
}
