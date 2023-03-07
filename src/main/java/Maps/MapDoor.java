package Maps;
import java.awt.*;
import java.util.Map;

public class MapDoor extends MapWeg{
    
    public enum DoorType {
        DOOR_OPEN,
        DOOR_CLOSED_UNLOCKED,
        DOOR_CLOSED_LOCKED,
        DOOR_TRAPPED,
        DOOR_SECRET,
        UNDEFINED
    }
    
    private int startInnerRectX = 0;
    private int endInnerRectX = 0;
    private int startInnerRectY = 0;
    private int endInnerRectY = 0;
    private int middleLineHorizontal = 0;
    private int middleLineVertical = 0;
    public int startInnerRectX() { return startInnerRectX; }
    public int endInnerRectX() { return endInnerRectX; }
    public int startInnerRectY() { return startInnerRectY; }
    public int endInnerRectY() { return endInnerRectY; }
    public int middleLineHorizontal() { return middleLineHorizontal; }
    public int middleLineVertical() { return middleLineVertical; }

    public static MapDoor getMapDoor(DoorType type, Position pos) {
        MapDoor door = new MapDoor(pos);
        switch (type) {
            case DOOR_OPEN:
                return door.new MapDoorOpen(pos);
            case DOOR_CLOSED_UNLOCKED:
                return door.new MapDoorClosed(pos);
            case DOOR_CLOSED_LOCKED:
                return door.new MapDoorLocked(pos);
            case DOOR_TRAPPED:
                return door.new MapDoorTrapped(pos);
            case DOOR_SECRET:
                return  door.new MapDoorSecret(pos);
            default:
                return door.new MapDoorOpen(pos);
        }
    }
    
    protected MapDoor(Position pos) { super(pos); }

    public WayType getWayType() {
        return WayType.DOOR;
    }

    public DoorType getDoorType() {
        return DoorType.UNDEFINED;
    }

    public void paint(Graphics g) {
        super.paint(g);
        startInnerRectX = (int)(getWidth() / 4.0);
        endInnerRectX = startInnerRectX + (int)(getWidth() / 2.0);
        startInnerRectY = (int)(getHeight() / 4.0);
        endInnerRectY = (int)(getHeight() / 4.0) + (int)(getHeight() / 2);
        middleLineHorizontal = (int)(getHeight() / 2.0);
        middleLineVertical = (int)(getWidth() / 2.0);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(getLineWidth()));
        g2d.setColor(Color.BLACK);
        int middleLine = (int)((getWidth() / 2.0) );
        g2d.drawLine(middleLine, 0, middleLine, (int)(getHeight() / 4.0));
        g2d.drawLine(middleLine, (int)(getHeight() / 4.0 * 3), middleLine, getHeight());
    }
    
    protected class MapDoorOpen extends MapDoor{
        public MapDoorOpen(Position pos) { super(pos); }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(getLineWidth()));
            g2d.setColor(Color.BLACK);
            g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, (int)(getHeight() / 4.0));
            g2d.drawLine(getWidth() / 2, (int)(getHeight() / 4.0 * 3.0), getWidth() / 2, getHeight());
        }
        @Override
        public DoorType getDoorType() {
            return DoorType.DOOR_OPEN;
        }
    }
    protected class MapDoorClosed extends MapDoor {
        public MapDoorClosed(Position pos) { super(pos); }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(getLineWidth()));
            g2d.setColor(Color.BLACK);
            g2d.drawRect(startInnerRectX(), startInnerRectY(), (int)(getWidth() / 2.0), (int)(getHeight() / 2));
        }
        @Override
        public DoorType getDoorType() {
            return DoorType.DOOR_CLOSED_UNLOCKED;
        }
    }

    protected class MapDoorLocked extends MapDoorClosed {
        public MapDoorLocked(Position pos) { super(pos); }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(getLineWidth()));
            g2d.setColor(Color.BLACK);
            g2d.drawLine(middleLineVertical(), 0, middleLineVertical(), getHeight());
        }
        @Override
        public DoorType getDoorType() {
            return DoorType.DOOR_CLOSED_LOCKED;
        }
    }

    protected class MapDoorTrapped extends MapDoorClosed {
        public MapDoorTrapped(Position pos) { super(pos); }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(getLineWidth()));
            g2d.setColor(Color.BLACK);
            g2d.drawLine(startInnerRectX() - startInnerRectX() / 2, middleLineHorizontal(), endInnerRectX() + startInnerRectX() / 2, middleLineHorizontal());
        }
        @Override
        public DoorType getDoorType() {
            return DoorType.DOOR_TRAPPED;
        }
    }

    protected class MapDoorSecret extends MapDoorClosed {
        public MapDoorSecret(Position pos) { super(pos); }
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(getLineWidth()));
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("TimesRoman", Font.PLAIN, endInnerRectY() - startInnerRectY()));
            g2d.drawString("$", getWidth() / 3, endInnerRectY() - getLineWidth());
        }
        @Override
        public DoorType getDoorType() {
            return DoorType.DOOR_SECRET;
        }
    }
}