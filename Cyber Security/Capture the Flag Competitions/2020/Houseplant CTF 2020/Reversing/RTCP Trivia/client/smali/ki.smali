.class public Lki;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lki$a;
    }
.end annotation


# static fields
.field static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkj;",
            ">;"
        }
    .end annotation
.end field

.field static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljx;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final A:I

.field final B:I

.field public final C:I

.field final c:Lka;

.field public final d:Ljava/net/Proxy;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkj;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljx;",
            ">;"
        }
    .end annotation
.end field

.field final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkg;",
            ">;"
        }
    .end annotation
.end field

.field final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkg;",
            ">;"
        }
    .end annotation
.end field

.field final i:Lkc$a;

.field public final j:Ljava/net/ProxySelector;

.field public final k:Ljz;

.field final l:Ljq;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final m:Lla;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final n:Ljavax/net/SocketFactory;

.field public final o:Ljavax/net/ssl/SSLSocketFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final p:Lmt;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final q:Ljavax/net/ssl/HostnameVerifier;

.field public final r:Lju;

.field public final s:Ljp;

.field public final t:Ljp;

.field public final u:Ljw;

.field public final v:Lkb;

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Lkj;

    sget-object v2, Lkj;->d:Lkj;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lkj;->b:Lkj;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lkv;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lki;->a:Ljava/util/List;

    new-array v0, v0, [Ljx;

    sget-object v1, Ljx;->a:Ljx;

    aput-object v1, v0, v3

    sget-object v1, Ljx;->c:Ljx;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkv;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lki;->b:Ljava/util/List;

    new-instance v0, Lki$1;

    invoke-direct {v0}, Lki$1;-><init>()V

    sput-object v0, Lkt;->a:Lkt;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lki$a;

    invoke-direct {v0}, Lki$a;-><init>()V

    invoke-direct {p0, v0}, Lki;-><init>(Lki$a;)V

    return-void
.end method

.method public constructor <init>(Lki$a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lki$a;->a:Lka;

    iput-object v0, p0, Lki;->c:Lka;

    iget-object v0, p1, Lki$a;->b:Ljava/net/Proxy;

    iput-object v0, p0, Lki;->d:Ljava/net/Proxy;

    iget-object v0, p1, Lki$a;->c:Ljava/util/List;

    iput-object v0, p0, Lki;->e:Ljava/util/List;

    iget-object v0, p1, Lki$a;->d:Ljava/util/List;

    iput-object v0, p0, Lki;->f:Ljava/util/List;

    iget-object v0, p1, Lki$a;->e:Ljava/util/List;

    invoke-static {v0}, Lkv;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lki;->g:Ljava/util/List;

    iget-object v0, p1, Lki$a;->f:Ljava/util/List;

    invoke-static {v0}, Lkv;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lki;->h:Ljava/util/List;

    iget-object v0, p1, Lki$a;->g:Lkc$a;

    iput-object v0, p0, Lki;->i:Lkc$a;

    iget-object v0, p1, Lki$a;->h:Ljava/net/ProxySelector;

    iput-object v0, p0, Lki;->j:Ljava/net/ProxySelector;

    iget-object v0, p1, Lki$a;->i:Ljz;

    iput-object v0, p0, Lki;->k:Ljz;

    iget-object v0, p1, Lki$a;->j:Ljq;

    iput-object v0, p0, Lki;->l:Ljq;

    iget-object v0, p1, Lki$a;->k:Lla;

    iput-object v0, p0, Lki;->m:Lla;

    iget-object v0, p1, Lki$a;->l:Ljavax/net/SocketFactory;

    iput-object v0, p0, Lki;->n:Ljavax/net/SocketFactory;

    iget-object v0, p0, Lki;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljx;

    if-nez v2, :cond_1

    iget-boolean v2, v3, Ljx;->d:Z

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lki$a;->m:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_4

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Lki;->a()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    invoke-static {v0}, Lki;->a(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, Lki;->o:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v1

    invoke-virtual {v1, v0}, Lmp;->a(Ljavax/net/ssl/X509TrustManager;)Lmt;

    move-result-object v0

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v0, p1, Lki$a;->m:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Lki;->o:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Lki$a;->n:Lmt;

    :goto_2
    iput-object v0, p0, Lki;->p:Lmt;

    iget-object v0, p1, Lki$a;->o:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lki;->q:Ljavax/net/ssl/HostnameVerifier;

    iget-object v0, p1, Lki$a;->p:Lju;

    iget-object v1, p0, Lki;->p:Lmt;

    iget-object v2, v0, Lju;->c:Lmt;

    invoke-static {v2, v1}, Lkv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    new-instance v2, Lju;

    iget-object v0, v0, Lju;->b:Ljava/util/Set;

    invoke-direct {v2, v0, v1}, Lju;-><init>(Ljava/util/Set;Lmt;)V

    move-object v0, v2

    :goto_3
    iput-object v0, p0, Lki;->r:Lju;

    iget-object v0, p1, Lki$a;->q:Ljp;

    iput-object v0, p0, Lki;->s:Ljp;

    iget-object v0, p1, Lki$a;->r:Ljp;

    iput-object v0, p0, Lki;->t:Ljp;

    iget-object v0, p1, Lki$a;->s:Ljw;

    iput-object v0, p0, Lki;->u:Ljw;

    iget-object v0, p1, Lki$a;->t:Lkb;

    iput-object v0, p0, Lki;->v:Lkb;

    iget-boolean v0, p1, Lki$a;->u:Z

    iput-boolean v0, p0, Lki;->w:Z

    iget-boolean v0, p1, Lki$a;->v:Z

    iput-boolean v0, p0, Lki;->x:Z

    iget-boolean v0, p1, Lki$a;->w:Z

    iput-boolean v0, p0, Lki;->y:Z

    iget v0, p1, Lki$a;->x:I

    iput v0, p0, Lki;->z:I

    iget v0, p1, Lki$a;->y:I

    iput v0, p0, Lki;->A:I

    iget v0, p1, Lki$a;->z:I

    iput v0, p0, Lki;->B:I

    iget p1, p1, Lki$a;->A:I

    iput p1, p0, Lki;->C:I

    iget-object p1, p0, Lki;->g:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lki;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    iget-object p1, p0, Lki;->h:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null network interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lki;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-void
.end method

.method private static a(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    :try_start_0
    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v0

    invoke-virtual {v0}, Lmp;->g_()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    invoke-virtual {v0, p0, v1, p0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "No System TLS"

    invoke-static {v0, p0}, Lkv;->a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method

.method private static a()Ljavax/net/ssl/X509TrustManager;
    .locals 4

    :try_start_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    aget-object v2, v0, v1

    instance-of v2, v2, Ljavax/net/ssl/X509TrustManager;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    aget-object v0, v0, v1

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    return-object v0

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected default trust managers:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "No System TLS"

    invoke-static {v1, v0}, Lkv;->a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    move-result-object v0

    throw v0
.end method
