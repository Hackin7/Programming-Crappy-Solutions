.class public final Llr;
.super Ljava/lang/Object;

# interfaces
.implements Lkg;


# instance fields
.field public volatile a:Llh;

.field public b:Ljava/lang/Object;

.field public volatile c:Z

.field private final d:Lki;

.field private final e:Z


# direct methods
.method public constructor <init>(Lki;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llr;->d:Lki;

    iput-boolean p2, p0, Llr;->e:Z

    return-void
.end method

.method private static a(Lkn;I)I
    .locals 1

    const-string v0, "Retry-After"

    invoke-virtual {p0, v0}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return p1

    :cond_0
    const-string p1, "\\d+"

    invoke-virtual {p0, p1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    const p0, 0x7fffffff

    return p0
.end method

.method private a(Lkf;)Ljo;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lkf;->b()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v0, Llr;->d:Lki;

    iget-object v3, v2, Lki;->o:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v2, v0, Llr;->d:Lki;

    iget-object v2, v2, Lki;->q:Ljavax/net/ssl/HostnameVerifier;

    iget-object v4, v0, Llr;->d:Lki;

    iget-object v4, v4, Lki;->r:Lju;

    move-object v11, v2

    move-object v10, v3

    move-object v12, v4

    goto :goto_0

    :cond_0
    move-object v10, v3

    move-object v11, v10

    move-object v12, v11

    :goto_0
    new-instance v2, Ljo;

    iget-object v6, v1, Lkf;->b:Ljava/lang/String;

    iget v7, v1, Lkf;->c:I

    iget-object v1, v0, Llr;->d:Lki;

    iget-object v8, v1, Lki;->v:Lkb;

    iget-object v1, v0, Llr;->d:Lki;

    iget-object v9, v1, Lki;->n:Ljavax/net/SocketFactory;

    iget-object v1, v0, Llr;->d:Lki;

    iget-object v13, v1, Lki;->s:Ljp;

    iget-object v1, v0, Llr;->d:Lki;

    iget-object v14, v1, Lki;->d:Ljava/net/Proxy;

    iget-object v1, v0, Llr;->d:Lki;

    iget-object v15, v1, Lki;->e:Ljava/util/List;

    iget-object v1, v0, Llr;->d:Lki;

    iget-object v1, v1, Lki;->f:Ljava/util/List;

    iget-object v3, v0, Llr;->d:Lki;

    iget-object v3, v3, Lki;->j:Ljava/net/ProxySelector;

    move-object v5, v2

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    invoke-direct/range {v5 .. v17}, Ljo;-><init>(Ljava/lang/String;ILkb;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lju;Ljp;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v2
.end method

.method private a(Ljava/io/IOException;Llh;ZLkl;)Z
    .locals 2

    invoke-virtual {p2, p1}, Llh;->a(Ljava/io/IOException;)V

    iget-object v0, p0, Llr;->d:Lki;

    iget-boolean v0, v0, Lki;->y:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p3, :cond_1

    iget-object p4, p4, Lkl;->d:Lkm;

    instance-of p4, p4, Llt;

    if-eqz p4, :cond_1

    return v1

    :cond_1
    instance-of p4, p1, Ljava/net/ProtocolException;

    const/4 v0, 0x1

    if-eqz p4, :cond_3

    :cond_2
    :goto_0
    move p1, v1

    goto :goto_1

    :cond_3
    instance-of p4, p1, Ljava/io/InterruptedIOException;

    if-eqz p4, :cond_4

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_2

    if-eqz p3, :cond_6

    goto :goto_0

    :cond_4
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_5

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_5

    goto :goto_0

    :cond_5
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    move p1, v0

    :goto_1
    if-nez p1, :cond_7

    return v1

    :cond_7
    iget-object p1, p2, Llh;->c:Lkp;

    if-nez p1, :cond_a

    iget-object p1, p2, Llh;->b:Llg$a;

    if-eqz p1, :cond_8

    iget-object p1, p2, Llh;->b:Llg$a;

    invoke-virtual {p1}, Llg$a;->a()Z

    move-result p1

    if-nez p1, :cond_a

    :cond_8
    iget-object p1, p2, Llh;->g:Llg;

    invoke-virtual {p1}, Llg;->a()Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_2

    :cond_9
    move p1, v1

    goto :goto_3

    :cond_a
    :goto_2
    move p1, v0

    :goto_3
    if-nez p1, :cond_b

    return v1

    :cond_b
    return v0
.end method

.method private static a(Lkn;Lkf;)Z
    .locals 2

    iget-object p0, p0, Lkn;->a:Lkl;

    iget-object p0, p0, Lkl;->a:Lkf;

    iget-object v0, p0, Lkf;->b:Ljava/lang/String;

    iget-object v1, p1, Lkf;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lkf;->c:I

    iget v1, p1, Lkf;->c:I

    if-ne v0, v1, :cond_0

    iget-object p0, p0, Lkf;->a:Ljava/lang/String;

    iget-object p1, p1, Lkf;->a:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Lkg$a;)Lkn;
    .locals 14

    invoke-interface {p1}, Lkg$a;->a()Lkl;

    move-result-object v0

    check-cast p1, Llo;

    iget-object v7, p1, Llo;->e:Ljs;

    iget-object v8, p1, Llo;->f:Lkc;

    new-instance v9, Llh;

    iget-object v1, p0, Llr;->d:Lki;

    iget-object v2, v1, Lki;->u:Ljw;

    iget-object v1, v0, Lkl;->a:Lkf;

    invoke-direct {p0, v1}, Llr;->a(Lkf;)Ljo;

    move-result-object v3

    iget-object v6, p0, Llr;->b:Ljava/lang/Object;

    move-object v1, v9

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, Llh;-><init>(Ljw;Ljo;Ljs;Lkc;Ljava/lang/Object;)V

    iput-object v9, p0, Llr;->a:Llh;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v2, v10

    move-object v1, v11

    :cond_0
    :goto_0
    iget-boolean v3, p0, Llr;->c:Z

    if-eqz v3, :cond_1

    invoke-virtual {v9}, Llh;->c()V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v3, 0x1

    :try_start_0
    invoke-virtual {p1, v0, v9, v11, v11}, Llo;->a(Lkl;Llh;Llk;Lld;)Lkn;

    move-result-object v4
    :try_end_0
    .catch Llf; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    invoke-virtual {v4}, Lkn;->a()Lkn$a;

    move-result-object v0

    invoke-virtual {v1}, Lkn;->a()Lkn$a;

    move-result-object v1

    iput-object v11, v1, Lkn$a;->g:Lko;

    invoke-virtual {v1}, Lkn$a;->a()Lkn;

    move-result-object v1

    iget-object v4, v1, Lkn;->g:Lko;

    if-eqz v4, :cond_2

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iput-object v1, v0, Lkn$a;->j:Lkn;

    invoke-virtual {v0}, Lkn$a;->a()Lkn;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v4

    :goto_1
    iget-object v1, v9, Llh;->c:Lkp;

    if-nez v0, :cond_4

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_4
    iget v4, v0, Lkn;->c:I

    iget-object v5, v0, Lkn;->a:Lkl;

    iget-object v5, v5, Lkl;->b:Ljava/lang/String;

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_9

    :sswitch_0
    iget-object v1, v0, Lkn;->j:Lkn;

    if-eqz v1, :cond_5

    iget-object v1, v0, Lkn;->j:Lkn;

    iget v1, v1, Lkn;->c:I

    const/16 v3, 0x1f7

    if-eq v1, v3, :cond_10

    :cond_5
    const v1, 0x7fffffff

    invoke-static {v0, v1}, Llr;->a(Lkn;I)I

    move-result v1

    if-nez v1, :cond_10

    :goto_2
    iget-object v1, v0, Lkn;->a:Lkl;

    goto :goto_5

    :sswitch_1
    iget-object v1, p0, Llr;->d:Lki;

    iget-boolean v1, v1, Lki;->y:Z

    if-eqz v1, :cond_10

    iget-object v1, v0, Lkn;->a:Lkl;

    iget-object v1, v1, Lkl;->d:Lkm;

    instance-of v1, v1, Llt;

    if-nez v1, :cond_10

    iget-object v1, v0, Lkn;->j:Lkn;

    if-eqz v1, :cond_6

    iget-object v1, v0, Lkn;->j:Lkn;

    iget v1, v1, Lkn;->c:I

    const/16 v3, 0x198

    if-eq v1, v3, :cond_10

    :cond_6
    invoke-static {v0, v10}, Llr;->a(Lkn;I)I

    move-result v1

    if-gtz v1, :cond_10

    goto :goto_2

    :sswitch_2
    if-eqz v1, :cond_7

    iget-object v1, v1, Lkp;->b:Ljava/net/Proxy;

    goto :goto_3

    :cond_7
    iget-object v1, p0, Llr;->d:Lki;

    iget-object v1, v1, Lki;->d:Ljava/net/Proxy;

    :goto_3
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-eq v1, v3, :cond_8

    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object v1, p0, Llr;->d:Lki;

    iget-object v1, v1, Lki;->s:Ljp;

    goto :goto_4

    :sswitch_3
    iget-object v1, p0, Llr;->d:Lki;

    iget-object v1, v1, Lki;->t:Ljp;

    :goto_4
    invoke-interface {v1}, Ljp;->a()Lkl;

    move-result-object v1

    :goto_5
    move-object v12, v1

    goto/16 :goto_a

    :sswitch_4
    const-string v1, "GET"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "HEAD"

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    :cond_9
    :sswitch_5
    iget-object v1, p0, Llr;->d:Lki;

    iget-boolean v1, v1, Lki;->x:Z

    if-eqz v1, :cond_10

    const-string v1, "Location"

    invoke-virtual {v0, v1}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    iget-object v4, v0, Lkn;->a:Lkl;

    iget-object v4, v4, Lkl;->a:Lkf;

    invoke-virtual {v4, v1}, Lkf;->c(Ljava/lang/String;)Lkf$a;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lkf$a;->b()Lkf;

    move-result-object v1

    goto :goto_6

    :cond_a
    move-object v1, v11

    :goto_6
    if-eqz v1, :cond_10

    iget-object v4, v1, Lkf;->a:Ljava/lang/String;

    iget-object v6, v0, Lkn;->a:Lkl;

    iget-object v6, v6, Lkl;->a:Lkf;

    iget-object v6, v6, Lkf;->a:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    iget-object v4, p0, Llr;->d:Lki;

    iget-boolean v4, v4, Lki;->w:Z

    if-eqz v4, :cond_10

    :cond_b
    iget-object v4, v0, Lkn;->a:Lkl;

    invoke-virtual {v4}, Lkl;->a()Lkl$a;

    move-result-object v4

    invoke-static {v5}, Lln;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    const-string v6, "PROPFIND"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v12, "PROPFIND"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    xor-int/2addr v3, v12

    if-eqz v3, :cond_c

    const-string v3, "GET"

    invoke-virtual {v4, v3, v11}, Lkl$a;->a(Ljava/lang/String;Lkm;)Lkl$a;

    goto :goto_8

    :cond_c
    if-eqz v6, :cond_d

    iget-object v3, v0, Lkn;->a:Lkl;

    iget-object v3, v3, Lkl;->d:Lkm;

    goto :goto_7

    :cond_d
    move-object v3, v11

    :goto_7
    invoke-virtual {v4, v5, v3}, Lkl$a;->a(Ljava/lang/String;Lkm;)Lkl$a;

    :goto_8
    if-nez v6, :cond_e

    const-string v3, "Transfer-Encoding"

    invoke-virtual {v4, v3}, Lkl$a;->a(Ljava/lang/String;)Lkl$a;

    const-string v3, "Content-Length"

    invoke-virtual {v4, v3}, Lkl$a;->a(Ljava/lang/String;)Lkl$a;

    const-string v3, "Content-Type"

    invoke-virtual {v4, v3}, Lkl$a;->a(Ljava/lang/String;)Lkl$a;

    :cond_e
    invoke-static {v0, v1}, Llr;->a(Lkn;Lkf;)Z

    move-result v3

    if-nez v3, :cond_f

    const-string v3, "Authorization"

    invoke-virtual {v4, v3}, Lkl$a;->a(Ljava/lang/String;)Lkl$a;

    :cond_f
    invoke-virtual {v4, v1}, Lkl$a;->a(Lkf;)Lkl$a;

    move-result-object v1

    invoke-virtual {v1}, Lkl$a;->a()Lkl;

    move-result-object v1

    goto/16 :goto_5

    :cond_10
    :goto_9
    move-object v12, v11

    :goto_a
    if-nez v12, :cond_12

    iget-boolean p1, p0, Llr;->e:Z

    if-nez p1, :cond_11

    invoke-virtual {v9}, Llh;->c()V

    :cond_11
    return-object v0

    :cond_12
    iget-object v1, v0, Lkn;->g:Lko;

    invoke-static {v1}, Lkv;->a(Ljava/io/Closeable;)V

    add-int/lit8 v13, v2, 0x1

    const/16 v1, 0x14

    if-le v13, v1, :cond_13

    invoke-virtual {v9}, Llh;->c()V

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Too many follow-up requests: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    iget-object v1, v12, Lkl;->d:Lkm;

    instance-of v1, v1, Llt;

    if-eqz v1, :cond_14

    invoke-virtual {v9}, Llh;->c()V

    new-instance p1, Ljava/net/HttpRetryException;

    const-string v1, "Cannot retry streamed HTTP body"

    iget v0, v0, Lkn;->c:I

    invoke-direct {p1, v1, v0}, Ljava/net/HttpRetryException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_14
    iget-object v1, v12, Lkl;->a:Lkf;

    invoke-static {v0, v1}, Llr;->a(Lkn;Lkf;)Z

    move-result v1

    if-nez v1, :cond_15

    invoke-virtual {v9}, Llh;->c()V

    new-instance v9, Llh;

    iget-object v1, p0, Llr;->d:Lki;

    iget-object v2, v1, Lki;->u:Ljw;

    iget-object v1, v12, Lkl;->a:Lkf;

    invoke-direct {p0, v1}, Llr;->a(Lkf;)Ljo;

    move-result-object v3

    iget-object v6, p0, Llr;->b:Ljava/lang/Object;

    move-object v1, v9

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, Llh;-><init>(Ljw;Ljo;Ljs;Lkc;Ljava/lang/Object;)V

    iput-object v9, p0, Llr;->a:Llh;

    goto :goto_b

    :cond_15
    invoke-virtual {v9}, Llh;->a()Llk;

    move-result-object v1

    if-eqz v1, :cond_16

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Closing the body of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " didn\'t close its backing stream. Bad interceptor?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    :goto_b
    move-object v1, v0

    move-object v0, v12

    move v2, v13

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    goto :goto_d

    :catch_0
    move-exception v4

    :try_start_1
    instance-of v5, v4, Llv;

    if-nez v5, :cond_17

    goto :goto_c

    :cond_17
    move v3, v10

    :goto_c
    invoke-direct {p0, v4, v9, v3, v0}, Llr;->a(Ljava/io/IOException;Llh;ZLkl;)Z

    move-result v3

    if-nez v3, :cond_0

    throw v4

    :catch_1
    move-exception v3

    iget-object v4, v3, Llf;->a:Ljava/io/IOException;

    invoke-direct {p0, v4, v9, v10, v0}, Llr;->a(Ljava/io/IOException;Llh;ZLkl;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object p1, v3, Llf;->a:Ljava/io/IOException;

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_d
    invoke-virtual {v9, v11}, Llh;->a(Ljava/io/IOException;)V

    invoke-virtual {v9}, Llh;->c()V

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x12c -> :sswitch_5
        0x12d -> :sswitch_5
        0x12e -> :sswitch_5
        0x12f -> :sswitch_5
        0x133 -> :sswitch_4
        0x134 -> :sswitch_4
        0x191 -> :sswitch_3
        0x197 -> :sswitch_2
        0x198 -> :sswitch_1
        0x1f7 -> :sswitch_0
    .end sparse-switch
.end method
