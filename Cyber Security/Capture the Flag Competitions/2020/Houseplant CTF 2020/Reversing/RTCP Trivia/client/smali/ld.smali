.class public final Lld;
.super Lmb$b;


# instance fields
.field public final a:Lkp;

.field public b:Ljava/net/Socket;

.field public c:Ljava/net/Socket;

.field public d:Lkd;

.field e:Lmb;

.field public f:Lne;

.field public g:Lnd;

.field public h:Z

.field public i:I

.field public j:I

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Llh;",
            ">;>;"
        }
    .end annotation
.end field

.field public l:J

.field private final n:Ljw;

.field private o:Lkj;


# direct methods
.method public constructor <init>(Ljw;Lkp;)V
    .locals 2

    invoke-direct {p0}, Lmb$b;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lld;->j:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lld;->k:Ljava/util/List;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lld;->l:J

    iput-object p1, p0, Lld;->n:Ljw;

    iput-object p2, p0, Lld;->a:Lkp;

    return-void
.end method

.method private a(II)V
    .locals 4

    iget-object v0, p0, Lld;->a:Lkp;

    iget-object v0, v0, Lkp;->b:Ljava/net/Proxy;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->a:Ljo;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, v1, Ljo;->c:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Lld;->b:Ljava/net/Socket;

    invoke-static {}, Lkc;->d()V

    iget-object v0, p0, Lld;->b:Ljava/net/Socket;

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    invoke-static {}, Lmp;->c()Lmp;

    move-result-object p2

    iget-object v0, p0, Lld;->b:Ljava/net/Socket;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p2, v0, v1, p1}, Lmp;->a(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object p1, p0, Lld;->b:Ljava/net/Socket;

    invoke-static {p1}, Lnl;->b(Ljava/net/Socket;)Lns;

    move-result-object p1

    invoke-static {p1}, Lnl;->a(Lns;)Lne;

    move-result-object p1

    iput-object p1, p0, Lld;->f:Lne;

    iget-object p1, p0, Lld;->b:Ljava/net/Socket;

    invoke-static {p1}, Lnl;->a(Ljava/net/Socket;)Lnr;

    move-result-object p1

    invoke-static {p1}, Lnl;->a(Lnr;)Lnd;

    move-result-object p1

    iput-object p1, p0, Lld;->g:Lnd;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "throw with null exception"

    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    return-void

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to connect to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method private a(Llc;)V
    .locals 8

    iget-object v0, p0, Lld;->a:Lkp;

    iget-object v0, v0, Lkp;->a:Ljo;

    iget-object v1, v0, Ljo;->i:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lld;->b:Ljava/net/Socket;

    iget-object v4, v0, Ljo;->a:Lkf;

    iget-object v4, v4, Lkf;->b:Ljava/lang/String;

    iget-object v5, v0, Ljo;->a:Lkf;

    iget v5, v5, Lkf;->c:I

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v3, p1, Llc;->b:I

    iget-object v4, p1, Llc;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_1

    iget-object v5, p1, Llc;->a:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljx;

    invoke-virtual {v5, v1}, Ljx;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v7

    if-eqz v7, :cond_0

    add-int/2addr v3, v6

    iput v3, p1, Llc;->b:I

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_1
    if-nez v5, :cond_2

    new-instance v0, Ljava/net/UnknownServiceException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to find acceptable protocols. isFallback="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p1, Llc;->d:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", modes="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Llc;->a:Ljava/util/List;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", supported protocols="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p1, v1}, Llc;->a(Ljavax/net/ssl/SSLSocket;)Z

    move-result v3

    iput-boolean v3, p1, Llc;->c:Z

    sget-object v3, Lkt;->a:Lkt;

    iget-boolean p1, p1, Llc;->d:Z

    invoke-virtual {v3, v5, v1, p1}, Lkt;->a(Ljx;Ljavax/net/ssl/SSLSocket;Z)V

    iget-boolean p1, v5, Ljx;->e:Z

    if-eqz p1, :cond_3

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object p1

    iget-object v3, v0, Ljo;->a:Lkf;

    iget-object v3, v3, Lkf;->b:Ljava/lang/String;

    iget-object v4, v0, Ljo;->e:Ljava/util/List;

    invoke-virtual {p1, v1, v3, v4}, Lmp;->a(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_3
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object p1

    const-string v3, "NONE"

    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_4

    const-string v3, "SSL_NULL_WITH_NULL_NULL"

    invoke-interface {p1}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    move v6, v4

    :goto_2
    if-nez v6, :cond_5

    new-instance p1, Ljava/io/IOException;

    const-string v0, "a valid ssl session was not established"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lkd;->a(Ljavax/net/ssl/SSLSession;)Lkd;

    move-result-object v3

    iget-object v6, v0, Ljo;->j:Ljavax/net/ssl/HostnameVerifier;

    iget-object v7, v0, Ljo;->a:Lkf;

    iget-object v7, v7, Lkf;->b:Ljava/lang/String;

    invoke-interface {v6, v7, p1}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, v3, Lkd;->b:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Hostname "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ljo;->a:Lkf;

    iget-object v0, v0, Lkf;->b:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n    certificate: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lju;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    DN: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    subjectAltNames: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lmu;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    iget-object p1, v0, Ljo;->k:Lju;

    iget-object v0, v0, Ljo;->a:Lkf;

    iget-object v0, v0, Lkf;->b:Ljava/lang/String;

    iget-object v4, v3, Lkd;->b:Ljava/util/List;

    invoke-virtual {p1, v0, v4}, Lju;->a(Ljava/lang/String;Ljava/util/List;)V

    iget-boolean p1, v5, Ljx;->e:Z

    if-eqz p1, :cond_7

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object p1

    invoke-virtual {p1, v1}, Lmp;->a(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_7
    iput-object v1, p0, Lld;->c:Ljava/net/Socket;

    iget-object p1, p0, Lld;->c:Ljava/net/Socket;

    invoke-static {p1}, Lnl;->b(Ljava/net/Socket;)Lns;

    move-result-object p1

    invoke-static {p1}, Lnl;->a(Lns;)Lne;

    move-result-object p1

    iput-object p1, p0, Lld;->f:Lne;

    iget-object p1, p0, Lld;->c:Ljava/net/Socket;

    invoke-static {p1}, Lnl;->a(Ljava/net/Socket;)Lnr;

    move-result-object p1

    invoke-static {p1}, Lnl;->a(Lnr;)Lnd;

    move-result-object p1

    iput-object p1, p0, Lld;->g:Lnd;

    iput-object v3, p0, Lld;->d:Lkd;

    if-eqz v2, :cond_8

    invoke-static {v2}, Lkj;->a(Ljava/lang/String;)Lkj;

    move-result-object p1

    goto :goto_3

    :cond_8
    sget-object p1, Lkj;->b:Lkj;

    :goto_3
    iput-object p1, p0, Lld;->o:Lkj;
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_9

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object p1

    invoke-virtual {p1, v1}, Lmp;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_9
    return-void

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception p1

    move-object v2, v1

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v1, v2

    goto :goto_5

    :catch_1
    move-exception p1

    :goto_4
    :try_start_2
    invoke-static {p1}, Lkv;->a(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_a
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_5
    if-eqz v1, :cond_b

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lmp;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_b
    invoke-static {v1}, Lkv;->a(Ljava/net/Socket;)V

    throw p1
.end method


# virtual methods
.method public final a(IIIIZ)V
    .locals 17

    move-object/from16 v1, p0

    iget-object v2, v1, Lld;->o:Lkj;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "already connected"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_0
    iget-object v2, v1, Lld;->a:Lkp;

    iget-object v2, v2, Lkp;->a:Ljo;

    iget-object v2, v2, Ljo;->f:Ljava/util/List;

    new-instance v3, Llc;

    invoke-direct {v3, v2}, Llc;-><init>(Ljava/util/List;)V

    iget-object v4, v1, Lld;->a:Lkp;

    iget-object v4, v4, Lkp;->a:Ljo;

    iget-object v4, v4, Ljo;->i:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v4, :cond_2

    sget-object v4, Ljx;->c:Ljx;

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v2, Llf;

    new-instance v3, Ljava/net/UnknownServiceException;

    const-string v4, "CLEARTEXT communication not enabled for client"

    invoke-direct {v3, v4}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Llf;-><init>(Ljava/io/IOException;)V

    throw v2

    :cond_1
    iget-object v2, v1, Lld;->a:Lkp;

    iget-object v2, v2, Lkp;->a:Ljo;

    iget-object v2, v2, Ljo;->a:Lkf;

    iget-object v2, v2, Lkf;->b:Ljava/lang/String;

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v4

    invoke-virtual {v4, v2}, Lmp;->b(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    new-instance v3, Llf;

    new-instance v4, Ljava/net/UnknownServiceException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CLEARTEXT communication to "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " not permitted by network security policy"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Llf;-><init>(Ljava/io/IOException;)V

    throw v3

    :cond_2
    const/4 v2, 0x0

    move-object v4, v2

    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x1

    :try_start_0
    iget-object v7, v1, Lld;->a:Lkp;

    invoke-virtual {v7}, Lkp;->a()Z

    move-result v7

    if-eqz v7, :cond_8

    new-instance v7, Lkl$a;

    invoke-direct {v7}, Lkl$a;-><init>()V

    iget-object v8, v1, Lld;->a:Lkp;

    iget-object v8, v8, Lkp;->a:Ljo;

    iget-object v8, v8, Ljo;->a:Lkf;

    invoke-virtual {v7, v8}, Lkl$a;->a(Lkf;)Lkl$a;

    move-result-object v7

    const-string v8, "Host"

    iget-object v9, v1, Lld;->a:Lkp;

    iget-object v9, v9, Lkp;->a:Ljo;

    iget-object v9, v9, Ljo;->a:Lkf;

    invoke-static {v9, v6}, Lkv;->a(Lkf;Z)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    move-result-object v7

    const-string v8, "Proxy-Connection"

    const-string v9, "Keep-Alive"

    invoke-virtual {v7, v8, v9}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    move-result-object v7

    const-string v8, "User-Agent"

    const-string v9, "okhttp/3.10.0"

    invoke-virtual {v7, v8, v9}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    move-result-object v7

    invoke-virtual {v7}, Lkl$a;->a()Lkl;

    move-result-object v7

    iget-object v8, v7, Lkl;->a:Lkf;

    invoke-direct/range {p0 .. p2}, Lld;->a(II)V

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "CONNECT "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v8, v6}, Lkv;->a(Lkf;Z)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " HTTP/1.1"

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Llu;

    iget-object v10, v1, Lld;->f:Lne;

    iget-object v11, v1, Lld;->g:Lnd;

    invoke-direct {v9, v2, v2, v10, v11}, Llu;-><init>(Lki;Llh;Lne;Lnd;)V

    iget-object v10, v1, Lld;->f:Lne;

    invoke-interface {v10}, Lne;->a()Lnt;

    move-result-object v10
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    move/from16 v11, p2

    int-to-long v12, v11

    :try_start_1
    sget-object v14, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v10, v12, v13, v14}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    iget-object v10, v1, Lld;->g:Lnd;

    invoke-interface {v10}, Lnd;->a()Lnt;

    move-result-object v10
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move/from16 v12, p3

    int-to-long v13, v12

    :try_start_2
    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v10, v13, v14, v15}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    iget-object v10, v7, Lkl;->c:Lke;

    invoke-virtual {v9, v10, v8}, Llu;->a(Lke;Ljava/lang/String;)V

    invoke-virtual {v9}, Llu;->b()V

    invoke-virtual {v9, v5}, Llu;->a(Z)Lkn$a;

    move-result-object v8

    iput-object v7, v8, Lkn$a;->a:Lkl;

    invoke-virtual {v8}, Lkn$a;->a()Lkn;

    move-result-object v7

    invoke-static {v7}, Llm;->a(Lkn;)J

    move-result-wide v13

    const-wide/16 v15, -0x1

    cmp-long v8, v13, v15

    if-nez v8, :cond_3

    const-wide/16 v13, 0x0

    :cond_3
    invoke-virtual {v9, v13, v14}, Llu;->a(J)Lns;

    move-result-object v8

    const v9, 0x7fffffff

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v8, v9, v10}, Lkv;->a(Lns;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {v8}, Lns;->close()V

    iget v8, v7, Lkn;->c:I

    const/16 v9, 0xc8

    if-eq v8, v9, :cond_5

    const/16 v9, 0x197

    if-eq v8, v9, :cond_4

    new-instance v8, Ljava/io/IOException;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Unexpected response code for CONNECT: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v7, v7, Lkn;->c:I

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v8

    :cond_4
    iget-object v7, v1, Lld;->a:Lkp;

    iget-object v7, v7, Lkp;->a:Ljo;

    iget-object v7, v7, Ljo;->d:Ljp;

    invoke-interface {v7}, Ljp;->a()Lkl;

    new-instance v7, Ljava/io/IOException;

    const-string v8, "Failed to authenticate with proxy"

    invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v7

    :cond_5
    iget-object v7, v1, Lld;->f:Lne;

    invoke-interface {v7}, Lne;->b()Lnc;

    move-result-object v7

    invoke-virtual {v7}, Lnc;->d()Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object v7, v1, Lld;->g:Lnd;

    invoke-interface {v7}, Lnd;->b()Lnc;

    move-result-object v7

    invoke-virtual {v7}, Lnc;->d()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_1

    :cond_6
    iget-object v7, v1, Lld;->b:Ljava/net/Socket;

    if-nez v7, :cond_9

    goto/16 :goto_3

    :cond_7
    :goto_1
    new-instance v7, Ljava/io/IOException;

    const-string v8, "TLS tunnel buffered too many bytes!"

    invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v7

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_8
    move/from16 v11, p2

    move/from16 v12, p3

    invoke-direct/range {p0 .. p2}, Lld;->a(II)V

    :cond_9
    iget-object v7, v1, Lld;->a:Lkp;

    iget-object v7, v7, Lkp;->a:Ljo;

    iget-object v7, v7, Ljo;->i:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v7, :cond_b

    sget-object v7, Lkj;->b:Lkj;

    iput-object v7, v1, Lld;->o:Lkj;

    iget-object v7, v1, Lld;->b:Ljava/net/Socket;

    iput-object v7, v1, Lld;->c:Ljava/net/Socket;

    :cond_a
    move/from16 v8, p4

    goto :goto_2

    :cond_b
    invoke-static {}, Lkc;->e()V

    invoke-direct {v1, v3}, Lld;->a(Llc;)V

    invoke-static {}, Lkc;->f()V

    iget-object v7, v1, Lld;->o:Lkj;

    sget-object v8, Lkj;->d:Lkj;

    if-ne v7, v8, :cond_a

    iget-object v7, v1, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v7, v5}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v7, Lmb$a;

    invoke-direct {v7}, Lmb$a;-><init>()V

    iget-object v8, v1, Lld;->c:Ljava/net/Socket;

    iget-object v9, v1, Lld;->a:Lkp;

    iget-object v9, v9, Lkp;->a:Ljo;

    iget-object v9, v9, Ljo;->a:Lkf;

    iget-object v9, v9, Lkf;->b:Ljava/lang/String;

    iget-object v10, v1, Lld;->f:Lne;

    iget-object v13, v1, Lld;->g:Lnd;

    iput-object v8, v7, Lmb$a;->a:Ljava/net/Socket;

    iput-object v9, v7, Lmb$a;->b:Ljava/lang/String;

    iput-object v10, v7, Lmb$a;->c:Lne;

    iput-object v13, v7, Lmb$a;->d:Lnd;

    iput-object v1, v7, Lmb$a;->e:Lmb$b;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move/from16 v8, p4

    :try_start_3
    iput v8, v7, Lmb$a;->h:I

    new-instance v9, Lmb;

    invoke-direct {v9, v7}, Lmb;-><init>(Lmb$a;)V

    iput-object v9, v1, Lld;->e:Lmb;

    iget-object v7, v1, Lld;->e:Lmb;

    iget-object v9, v7, Lmb;->q:Lme;

    invoke-virtual {v9}, Lme;->a()V

    iget-object v9, v7, Lmb;->q:Lme;

    iget-object v10, v7, Lmb;->m:Lmh;

    invoke-virtual {v9, v10}, Lme;->b(Lmh;)V

    iget-object v9, v7, Lmb;->m:Lmh;

    invoke-virtual {v9}, Lmh;->b()I

    move-result v9

    const v10, 0xffff

    if-eq v9, v10, :cond_c

    iget-object v13, v7, Lmb;->q:Lme;

    sub-int/2addr v9, v10

    int-to-long v9, v9

    invoke-virtual {v13, v5, v9, v10}, Lme;->a(IJ)V

    :cond_c
    new-instance v9, Ljava/lang/Thread;

    iget-object v7, v7, Lmb;->r:Lmb$d;

    invoke-direct {v9, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v9}, Ljava/lang/Thread;->start()V

    :goto_2
    invoke-static {}, Lkc;->g()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_3
    iget-object v2, v1, Lld;->a:Lkp;

    invoke-virtual {v2}, Lkp;->a()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, v1, Lld;->b:Ljava/net/Socket;

    if-nez v2, :cond_d

    new-instance v2, Ljava/net/ProtocolException;

    const-string v3, "Too many tunnel connections attempted: 21"

    invoke-direct {v2, v3}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    new-instance v3, Llf;

    invoke-direct {v3, v2}, Llf;-><init>(Ljava/io/IOException;)V

    throw v3

    :cond_d
    iget-object v2, v1, Lld;->e:Lmb;

    if-eqz v2, :cond_e

    iget-object v2, v1, Lld;->n:Ljw;

    monitor-enter v2

    :try_start_4
    iget-object v3, v1, Lld;->e:Lmb;

    invoke-virtual {v3}, Lmb;->a()I

    move-result v3

    iput v3, v1, Lld;->j:I

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    move-object v3, v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v3

    :cond_e
    return-void

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    move/from16 v11, p2

    :goto_4
    move/from16 v12, p3

    :goto_5
    move/from16 v8, p4

    :goto_6
    move-object v7, v0

    iget-object v9, v1, Lld;->c:Ljava/net/Socket;

    invoke-static {v9}, Lkv;->a(Ljava/net/Socket;)V

    iget-object v9, v1, Lld;->b:Ljava/net/Socket;

    invoke-static {v9}, Lkv;->a(Ljava/net/Socket;)V

    iput-object v2, v1, Lld;->c:Ljava/net/Socket;

    iput-object v2, v1, Lld;->b:Ljava/net/Socket;

    iput-object v2, v1, Lld;->f:Lne;

    iput-object v2, v1, Lld;->g:Lnd;

    iput-object v2, v1, Lld;->d:Lkd;

    iput-object v2, v1, Lld;->o:Lkj;

    iput-object v2, v1, Lld;->e:Lmb;

    invoke-static {}, Lkc;->h()V

    if-nez v4, :cond_f

    new-instance v4, Llf;

    invoke-direct {v4, v7}, Llf;-><init>(Ljava/io/IOException;)V

    :goto_7
    move-object v9, v4

    goto :goto_8

    :cond_f
    iget-object v9, v4, Llf;->a:Ljava/io/IOException;

    invoke-static {v7, v9}, Llf;->a(Ljava/io/IOException;Ljava/io/IOException;)V

    iput-object v7, v4, Llf;->a:Ljava/io/IOException;

    goto :goto_7

    :goto_8
    if-eqz p5, :cond_14

    iput-boolean v6, v3, Llc;->d:Z

    iget-boolean v10, v3, Llc;->c:Z

    if-eqz v10, :cond_12

    instance-of v10, v7, Ljava/net/ProtocolException;

    if-nez v10, :cond_12

    instance-of v10, v7, Ljava/io/InterruptedIOException;

    if-nez v10, :cond_12

    instance-of v10, v7, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v10, :cond_10

    invoke-virtual {v7}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v13

    instance-of v13, v13, Ljava/security/cert/CertificateException;

    if-nez v13, :cond_12

    :cond_10
    instance-of v13, v7, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v13, :cond_12

    if-nez v10, :cond_11

    instance-of v7, v7, Ljavax/net/ssl/SSLProtocolException;

    if-eqz v7, :cond_12

    :cond_11
    move v5, v6

    :cond_12
    if-nez v5, :cond_13

    goto :goto_9

    :cond_13
    move-object v4, v9

    goto/16 :goto_0

    :cond_14
    :goto_9
    throw v9
.end method

.method public final a(Lmb;)V
    .locals 1

    iget-object v0, p0, Lld;->n:Ljw;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lmb;->a()I

    move-result p1

    iput p1, p0, Lld;->j:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Lmd;)V
    .locals 1

    sget-object v0, Llw;->e:Llw;

    invoke-virtual {p1, v0}, Lmd;->a(Llw;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lld;->e:Lmb;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a(Ljo;Lkp;)Z
    .locals 4
    .param p2    # Lkp;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lld;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lld;->j:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_a

    iget-boolean v0, p0, Lld;->h:Z

    if-eqz v0, :cond_0

    return v2

    :cond_0
    sget-object v0, Lkt;->a:Lkt;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->a:Ljo;

    invoke-virtual {v0, v1, p1}, Lkt;->a(Ljo;Ljo;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p1, Ljo;->a:Lkf;

    iget-object v0, v0, Lkf;->b:Ljava/lang/String;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->a:Ljo;

    iget-object v1, v1, Ljo;->a:Lkf;

    iget-object v1, v1, Lkf;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lld;->e:Lmb;

    if-nez v0, :cond_3

    return v2

    :cond_3
    if-nez p2, :cond_4

    return v2

    :cond_4
    iget-object v0, p2, Lkp;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_5

    return v2

    :cond_5
    iget-object v0, p0, Lld;->a:Lkp;

    iget-object v0, v0, Lkp;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_6

    return v2

    :cond_6
    iget-object v0, p0, Lld;->a:Lkp;

    iget-object v0, v0, Lkp;->c:Ljava/net/InetSocketAddress;

    iget-object v3, p2, Lkp;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    return v2

    :cond_7
    iget-object p2, p2, Lkp;->a:Ljo;

    iget-object p2, p2, Ljo;->j:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Lmu;->a:Lmu;

    if-eq p2, v0, :cond_8

    return v2

    :cond_8
    iget-object p2, p1, Ljo;->a:Lkf;

    invoke-virtual {p0, p2}, Lld;->a(Lkf;)Z

    move-result p2

    if-nez p2, :cond_9

    return v2

    :cond_9
    :try_start_0
    iget-object p2, p1, Ljo;->k:Lju;

    iget-object p1, p1, Ljo;->a:Lkf;

    iget-object p1, p1, Lkf;->b:Ljava/lang/String;

    iget-object v0, p0, Lld;->d:Lkd;

    iget-object v0, v0, Lkd;->b:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, Lju;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_a
    return v2
.end method

.method public final a(Lkf;)Z
    .locals 3

    iget v0, p1, Lkf;->c:I

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->a:Ljo;

    iget-object v1, v1, Ljo;->a:Lkf;

    iget v1, v1, Lkf;->c:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p1, Lkf;->b:Ljava/lang/String;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->a:Ljo;

    iget-object v1, v1, Ljo;->a:Lkf;

    iget-object v1, v1, Lkf;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lld;->d:Lkd;

    if-eqz v0, :cond_1

    sget-object v0, Lmu;->a:Lmu;

    iget-object p1, p1, Lkf;->b:Ljava/lang/String;

    iget-object v0, p0, Lld;->d:Lkd;

    iget-object v0, v0, Lkd;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-static {p1, v0}, Lmu;->a(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method public final a(Z)Z
    .locals 4

    iget-object v0, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget-object v0, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lld;->e:Lmb;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-object p1, p0, Lld;->e:Lmb;

    invoke-virtual {p1}, Lmb;->c()Z

    move-result p1

    if-nez p1, :cond_1

    return v2

    :cond_1
    return v1

    :cond_2
    if-eqz p1, :cond_4

    :try_start_0
    iget-object p1, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, p0, Lld;->f:Lne;

    invoke-interface {v0}, Lne;->d()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    :try_start_2
    iget-object v0, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v1

    :cond_3
    iget-object v0, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v2

    :catchall_0
    move-exception v0

    iget-object v3, p0, Lld;->c:Ljava/net/Socket;

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v0
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return v1

    :catch_1
    :cond_4
    return v2

    :cond_5
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->a:Ljo;

    iget-object v1, v1, Ljo;->a:Lkf;

    iget-object v1, v1, Lkf;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->a:Ljo;

    iget-object v1, v1, Ljo;->a:Lkf;

    iget v1, v1, Lkf;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lld;->a:Lkp;

    iget-object v1, v1, Lkp;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lld;->d:Lkd;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lld;->d:Lkd;

    iget-object v1, v1, Lkd;->a:Ljv;

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lld;->o:Lkj;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
