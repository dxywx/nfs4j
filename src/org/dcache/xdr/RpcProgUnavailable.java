package org.dcache.xdr;

public class RpcProgUnavailable extends RpcAcceptedReply {

    private final RpcAuth _auth;    
    
    public RpcProgUnavailable(int xid, RpcAuth auth) {
        super(xid);
        _auth = auth;
    }

    /* (non-Javadoc)
     * @see org.dcache.xdr.RpcReply#xdrDecode(org.dcache.xdr.Xdr)
     */
    @Override
    public void xdrDecode(Xdr xdr) {
        // TODO Auto-generated method stub
        super.xdrDecode(xdr);
    }

    /* (non-Javadoc)
     * @see org.dcache.xdr.RpcReply#xdrEncode(org.dcache.xdr.Xdr)
     */
    @Override
    public void xdrEncode(Xdr xdr) throws XdrException {
        super.xdrEncode(xdr);
        _auth.xdrEncode(xdr);
        xdr.put_int(RpcAccepsStatus.PROG_UNAVAIL);
    }

}
