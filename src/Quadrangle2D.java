public class Quadrangle2D{
    public Point2D point1,point2,point3,point4;
    private int area;

    public Quadrangle2D(Point2D p1, Point2D p2,Point2D p3,Point2D p4) {
        if (p1.isIdentical(p2) || p1.isIdentical(p3) || p1.isIdentical(p4) || p2.isIdentical(p3) || p2.isIdentical(p3) || p3.isIdentical(p4)) {
            point1 = p1;
            point2 = p2;
            point3 = p3;
            point4 = p4;
        } else {
            System.out.println("Invalid points please,reorder them or change them! ");
        }
    }

    public boolean isRectanlge()
    {    if((point1.getX()==point2.getX())&&(point1.getY()==point4.getY())&&(point2.getY()==point3.getY())&&(point3.getX()==point4.getX()))
        return true;
    else
        return false;
    }
    public boolean isSquare()
    {
        if((point2.getY()-point1.getY()==point3.getY()-point4.getY())&&(point3.getX()-point2.getX()==point4.getX()-point1.getX()))
            return true;
        else
            return false;
    }


    }