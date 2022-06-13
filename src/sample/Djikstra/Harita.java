package sample.Djikstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Harita {
    private final Map<Node,List<Node>> map;

    public Harita() {
        map = new HashMap<>();
        creatMap();
    }

    private void creatMap(){
        Node da = new Node(3,0);
        Node ka = new Node(10,0);
        Node bb = new Node(1,1);
        Node cb = new Node(2,1);
        Node db = new Node(3,1);
        Node eb = new Node(4,1);
        Node gb = new Node(6,1);
        Node hb = new Node(7,1);
        Node ib = new Node(8,1);
        Node jb = new Node(9,1);
        Node kb = new Node(10,1);
        Node lb = new Node(11,1);
        Node bc = new Node(1,2);
        Node dc = new Node(3,2);
        Node ec = new Node(4,2);
        Node fc = new Node(5,2);
        Node gc = new Node(6,2);
        Node hc = new Node(7,2);
        Node ic = new Node(8,2);
        Node lc = new Node(11,2);
        Node bd = new Node(1,3);
        Node cd = new Node(2,3);
        Node dd = new Node(3,3);
        Node ed = new Node(4,3);
        Node gd = new Node(6,3);
        Node id = new Node(8,3);
        Node jd = new Node(9,3);
        Node ld = new Node(11,3);
        Node be = new Node(1,4);
        Node de = new Node(3,4);
        Node ge = new Node(6,4);
        Node ie = new Node(8,4);
        Node le = new Node(11,4);
        Node af = new Node(0,5);
        Node bf = new Node(1,5);
        Node df = new Node(3,5);
        Node ef = new Node(4,5);
        Node ff = new Node(5,5);
        Node gf = new Node(6,5);
        Node iif = new Node(8,5);
        Node kf = new Node(10,5);
        Node lf = new Node(11,5);
        Node bg = new Node(1,6);
        Node eg = new Node(4,6);
        Node fg = new Node(5,6);
        Node gg = new Node(6,6);
        Node ig = new Node(8,6);
        Node jg = new Node(9,6);
        Node kg = new Node(10,6);
        Node lg = new Node(11,6);
        Node bh = new Node(1,7);
        Node dh = new Node(3,7);
        Node eh = new Node(4,7);
        Node fh = new Node(5,7);
        Node gh = new Node(6,7);
        Node hh = new Node(7,7);
        Node ih = new Node(8,7);
        Node jh = new Node(9,7);
        Node kh = new Node(10,7);
        Node lh = new Node(11,7);
        Node mh = new Node(12,7);
        Node bi = new Node(1,8);
        Node di = new Node(3,8);
        Node ji = new Node(9,8);
        Node ki = new Node(10,8);
        Node li = new Node(11,8);
        Node bj = new Node(1,9);
        Node cj = new Node(2,9);
        Node dj = new Node(3,9);
        Node ej = new Node(4,9);
        Node fj = new Node(5,9);
        Node gj = new Node(6,9);
        Node hj = new Node(7,9);
        Node ij = new Node(8,9);
        Node jj = new Node(9,9);
        Node kj = new Node(10,9);
        Node lj = new Node(11,9);
        Node dk = new Node(3,10);

        List<Node> Node = new LinkedList<>();
        Node.add(db);
        map.put(da, Node);

        Node = new LinkedList<>();
        Node.add(kb);
        map.put(ka, Node);


        Node = new LinkedList<>();
        Node.add(cb);
        Node.add(bc);
        map.put(bb, Node);

        Node = new LinkedList<>();
        Node.add(db);
        Node.add(bb);
        map.put(cb, Node);

        Node = new LinkedList<>();
        Node.add(da);
        Node.add(dc);
        Node.add(cb);
        Node.add(eb);
        map.put(db, Node);


        Node = new LinkedList<>();
        Node.add(db);
        Node.add(ec);
        map.put(eb, Node);

        Node = new LinkedList<>();
        Node.add(gc);
        Node.add(hb);
        map.put(gb, Node);

        Node = new LinkedList<>();
        Node.add(gb);
        Node.add(ib);
        Node.add(hc);
        map.put(hb, Node);

        Node = new LinkedList<>();
        Node.add(hb);
        Node.add(jb);
        Node.add(ic);
        map.put(ib, Node);

        Node = new LinkedList<>();
        Node.add(ib);
        Node.add(kb);
        map.put(jb, Node);

        Node = new LinkedList<>();
        Node.add(lb);
        Node.add(jb);
        Node.add(ka);
        map.put(kb, Node);

        Node = new LinkedList<>();
        Node.add(kb);
        Node.add(lc);
        map.put(lb, Node);

        Node = new LinkedList<>();
        Node.add(bb);
        Node.add(bd);
        map.put(bc, Node);

        Node = new LinkedList<>();
        Node.add(ec);
        Node.add(db);
        Node.add(dd);
        map.put(dc, Node);

        Node = new LinkedList<>();
        Node.add(eb);
        Node.add(ed);
        Node.add(dc);
        Node.add(fc);
        map.put(ec, Node);

        Node = new LinkedList<>();
        Node.add(ec);
        Node.add(gc);
        map.put(fc, Node);

        Node = new LinkedList<>();
        Node.add(gb);
        Node.add(hc);
        Node.add(gd);
        Node.add(fc);
        map.put(gc, Node);

        Node = new LinkedList<>();
        Node.add(hb);
        Node.add(gc);
        Node.add(ic);
        map.put(hc, Node);

        Node = new LinkedList<>();
        Node.add(hc);
        Node.add(ib);
        Node.add(id);
        map.put(ic, Node);

        Node = new LinkedList<>();
        Node.add(lb);
        Node.add(ld);
        map.put(lc, Node);

        Node = new LinkedList<>();
        Node.add(bc);
        Node.add(cd);
        Node.add(be);
        map.put(bd, Node);

        Node = new LinkedList<>();
        Node.add(bd);
        Node.add(dd);
        map.put(cd, Node);

        Node = new LinkedList<>();
        Node.add(dc);
        Node.add(de);
        Node.add(cd);
        Node.add(ed);
        map.put(dd, Node);

        Node = new LinkedList<>();
        Node.add(ec);
        Node.add(dd);
        map.put(ed, Node);

        Node = new LinkedList<>();
        Node.add(gc);
        Node.add(ge);
        map.put(gd, Node);

        Node = new LinkedList<>();
        Node.add(ic);
        Node.add(jd);
        Node.add(ie);
        map.put(id, Node);

        Node = new LinkedList<>();
        Node.add(id);
        map.put(jd, Node);

        Node = new LinkedList<>();
        Node.add(lc);
        Node.add(le);
        map.put(ld, Node);

        Node = new LinkedList<>();
        Node.add(bd);
        Node.add(bf);
        map.put(be,Node);

        Node = new LinkedList<>();
        Node.add(dd);
        Node.add(df);
        map.put(de,Node);

        Node = new LinkedList<>();
        Node.add(gd);
        Node.add(gf);
        map.put(ge, Node);

        Node = new LinkedList<>();
        Node.add(id);
        Node.add(iif);
        map.put(ie,Node);

        Node = new LinkedList<>();
        Node.add(ld);
        Node.add(lf);
        map.put(le,Node);

        Node = new LinkedList<>();
        Node.add(bf);
        map.put(af, Node);

        Node = new LinkedList<>();
        Node.add(be);
        Node.add(af);
        Node.add(bg);
        map.put(bf, Node);

        Node = new LinkedList<>();
        Node.add(de);
        Node.add(ef);
        map.put(df, Node);

        Node = new LinkedList<>();
        Node.add(df);
        Node.add(ff);
        Node.add(eg);
        map.put(ef, Node);

        Node = new LinkedList<>();
        Node.add(ef);
        Node.add(fg);
        Node.add(gf);
        map.put(ff, Node);

        Node = new LinkedList<>();
        Node.add(ge);
        Node.add(gg);
        Node.add(ff);
        map.put(gf, Node);

        Node = new LinkedList<>();
        Node.add(ie);
        Node.add(ig);
        map.put(iif, Node);

        Node = new LinkedList<>();
        Node.add(lf);
        Node.add(kg);
        map.put(kf, Node);

        Node = new LinkedList<>();
        Node.add(le);
        Node.add(kf);
        Node.add(lg);
        map.put(lf, Node);

        Node = new LinkedList<>();
        Node.add(bf);
        Node.add(bh);
        map.put(bg, Node);

        Node = new LinkedList<>();
        Node.add(ef);
        Node.add(fg);
        Node.add(eh);
        map.put(eg, Node);

        Node = new LinkedList<>();
        Node.add(ff);
        Node.add(eg);
        Node.add(gg);
        Node.add(fh);
        map.put(fg, Node);

        Node = new LinkedList<>();
        Node.add(gf);
        Node.add(gh);
        Node.add(fg);
        map.put(gg, Node);

        Node = new LinkedList<>();
        Node.add(iif);
        Node.add(ih);
        Node.add(jg);
        map.put(ig, Node);

        Node = new LinkedList<>();
        Node.add(ig);
        Node.add(kg);
        Node.add(jh);
        map.put(jg, Node);

        Node = new LinkedList<>();
        Node.add(jg);
        Node.add(kf);
        Node.add(kh);
        Node.add(lg);
        map.put(kg, Node);

        Node = new LinkedList<>();
        Node.add(lf);
        Node.add(kg);
        Node.add(lh);
        map.put(lg, Node);

        Node = new LinkedList<>();
        Node.add(bg);
        Node.add(bi);
        map.put(bh, Node);

        Node = new LinkedList<>();
        Node.add(eh);
        Node.add(di);
        map.put(dh, Node);

        Node = new LinkedList<>();
        Node.add(eg);
        Node.add(fh);
        Node.add(dh);
        map.put(eh, Node);

        Node = new LinkedList<>();
        Node.add(fg);
        Node.add(gh);
        Node.add(eh);
        map.put(fh, Node);

        Node = new LinkedList<>();
        Node.add(gg);
        Node.add(hh);
        Node.add(fh);
        map.put(gh, Node);

        Node = new LinkedList<>();
        Node.add(gh);
        Node.add(ih);
        map.put(hh, Node);

        Node = new LinkedList<>();
        Node.add(hh);
        Node.add(ig);
        Node.add(jh);
        map.put(ih, Node);

        Node = new LinkedList<>();
        Node.add(jg);
        Node.add(ih);
        Node.add(kh);
        Node.add(ji);
        map.put(jh, Node);

        Node = new LinkedList<>();
        Node.add(kg);
        Node.add(ki);
        Node.add(jh);
        Node.add(lh);
        map.put(kh, Node);

        Node = new LinkedList<>();
        Node.add(lg);
        Node.add(kh);
        Node.add(mh);
        Node.add(li);
        map.put(lh, Node);

        Node = new LinkedList<>();
        Node.add(lh);
        map.put(mh, Node);

        Node = new LinkedList<>();
        Node.add(bh);
        Node.add(bj);
        map.put(bi, Node);

        Node = new LinkedList<>();
        Node.add(dh);
        Node.add(dj);
        map.put(di, Node);

        Node = new LinkedList<>();
        Node.add(jh);
        Node.add(ki);
        Node.add(jj);
        map.put(ji, Node);

        Node = new LinkedList<>();
        Node.add(kh);
        Node.add(ji);
        Node.add(li);
        Node.add(kj);
        map.put(ki, Node);

        Node = new LinkedList<>();
        Node.add(lh);
        Node.add(ki);
        Node.add(lj);
        map.put(li, Node);

        Node = new LinkedList<>();
        Node.add(bi);
        Node.add(cj);
        map.put(bj, Node);

        Node = new LinkedList<>();
        Node.add(bj);
        Node.add(dj);
        map.put(cj, Node);

        Node = new LinkedList<>();
        Node.add(di);
        Node.add(dk);
        Node.add(cj);
        Node.add(ej);
        map.put(dj, Node);

        Node = new LinkedList<>();
        Node.add(dj);
        Node.add(fj);
        map.put(ej, Node);

        Node = new LinkedList<>();
        Node.add(ej);
        Node.add(gj);
        map.put(fj, Node);

        Node = new LinkedList<>();
        Node.add(fj);
        Node.add(hj);
        map.put(gj, Node);

        Node = new LinkedList<>();
        Node.add(gj);
        Node.add(ij);
        map.put(hj, Node);

        Node = new LinkedList<>();
        Node.add(hj);
        Node.add(jj);
        map.put(ij, Node);

        Node = new LinkedList<>();
        Node.add(ji);
        Node.add(ij);
        Node.add(kj);
        map.put(jj, Node);

        Node = new LinkedList<>();
        Node.add(jj);
        Node.add(ki);
        Node.add(lj);
        map.put(kj, Node);

        Node = new LinkedList<>();
        Node.add(li);
        Node.add(kj);
        map.put(lj, Node);

        Node = new LinkedList<>();
        Node.add(dj);
        map.put(dk, Node);
    }

    public Map<Node, List<Node>> getMap() {
        return map;
    }
}
