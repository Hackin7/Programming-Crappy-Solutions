.class public final Lki$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lki;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field A:I

.field a:Lka;

.field b:Ljava/net/Proxy;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkj;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljx;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkg;",
            ">;"
        }
    .end annotation
.end field

.field final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkg;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lkc$a;

.field h:Ljava/net/ProxySelector;

.field i:Ljz;

.field j:Ljq;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field k:Lla;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field l:Ljavax/net/SocketFactory;

.field m:Ljavax/net/ssl/SSLSocketFactory;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field n:Lmt;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field o:Ljavax/net/ssl/HostnameVerifier;

.field p:Lju;

.field q:Ljp;

.field r:Ljp;

.field s:Ljw;

.field t:Lkb;

.field u:Z

.field v:Z

.field w:Z

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lki$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lki$a;->f:Ljava/util/List;

    new-instance v0, Lka;

    invoke-direct {v0}, Lka;-><init>()V

    iput-object v0, p0, Lki$a;->a:Lka;

    sget-object v0, Lki;->a:Ljava/util/List;

    iput-object v0, p0, Lki$a;->c:Ljava/util/List;

    sget-object v0, Lki;->b:Ljava/util/List;

    iput-object v0, p0, Lki$a;->d:Ljava/util/List;

    sget-object v0, Lkc;->a:Lkc;

    invoke-static {v0}, Lkc;->a(Lkc;)Lkc$a;

    move-result-object v0

    iput-object v0, p0, Lki$a;->g:Lkc$a;

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Lki$a;->h:Ljava/net/ProxySelector;

    sget-object v0, Ljz;->a:Ljz;

    iput-object v0, p0, Lki$a;->i:Ljz;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lki$a;->l:Ljavax/net/SocketFactory;

    sget-object v0, Lmu;->a:Lmu;

    iput-object v0, p0, Lki$a;->o:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Lju;->a:Lju;

    iput-object v0, p0, Lki$a;->p:Lju;

    sget-object v0, Ljp;->a:Ljp;

    iput-object v0, p0, Lki$a;->q:Ljp;

    sget-object v0, Ljp;->a:Ljp;

    iput-object v0, p0, Lki$a;->r:Ljp;

    new-instance v0, Ljw;

    invoke-direct {v0}, Ljw;-><init>()V

    iput-object v0, p0, Lki$a;->s:Ljw;

    sget-object v0, Lkb;->a:Lkb;

    iput-object v0, p0, Lki$a;->t:Lkb;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lki$a;->u:Z

    iput-boolean v0, p0, Lki$a;->v:Z

    iput-boolean v0, p0, Lki$a;->w:Z

    const/16 v0, 0x2710

    iput v0, p0, Lki$a;->x:I

    iput v0, p0, Lki$a;->y:I

    iput v0, p0, Lki$a;->z:I

    const/4 v0, 0x0

    iput v0, p0, Lki$a;->A:I

    return-void
.end method

.method public constructor <init>(Lki;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lki$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lki$a;->f:Ljava/util/List;

    iget-object v0, p1, Lki;->c:Lka;

    iput-object v0, p0, Lki$a;->a:Lka;

    iget-object v0, p1, Lki;->d:Ljava/net/Proxy;

    iput-object v0, p0, Lki$a;->b:Ljava/net/Proxy;

    iget-object v0, p1, Lki;->e:Ljava/util/List;

    iput-object v0, p0, Lki$a;->c:Ljava/util/List;

    iget-object v0, p1, Lki;->f:Ljava/util/List;

    iput-object v0, p0, Lki$a;->d:Ljava/util/List;

    iget-object v0, p0, Lki$a;->e:Ljava/util/List;

    iget-object v1, p1, Lki;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lki$a;->f:Ljava/util/List;

    iget-object v1, p1, Lki;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p1, Lki;->i:Lkc$a;

    iput-object v0, p0, Lki$a;->g:Lkc$a;

    iget-object v0, p1, Lki;->j:Ljava/net/ProxySelector;

    iput-object v0, p0, Lki$a;->h:Ljava/net/ProxySelector;

    iget-object v0, p1, Lki;->k:Ljz;

    iput-object v0, p0, Lki$a;->i:Ljz;

    iget-object v0, p1, Lki;->m:Lla;

    iput-object v0, p0, Lki$a;->k:Lla;

    iget-object v0, p1, Lki;->l:Ljq;

    iput-object v0, p0, Lki$a;->j:Ljq;

    iget-object v0, p1, Lki;->n:Ljavax/net/SocketFactory;

    iput-object v0, p0, Lki$a;->l:Ljavax/net/SocketFactory;

    iget-object v0, p1, Lki;->o:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Lki$a;->m:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Lki;->p:Lmt;

    iput-object v0, p0, Lki$a;->n:Lmt;

    iget-object v0, p1, Lki;->q:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lki$a;->o:Ljavax/net/ssl/HostnameVerifier;

    iget-object v0, p1, Lki;->r:Lju;

    iput-object v0, p0, Lki$a;->p:Lju;

    iget-object v0, p1, Lki;->s:Ljp;

    iput-object v0, p0, Lki$a;->q:Ljp;

    iget-object v0, p1, Lki;->t:Ljp;

    iput-object v0, p0, Lki$a;->r:Ljp;

    iget-object v0, p1, Lki;->u:Ljw;

    iput-object v0, p0, Lki$a;->s:Ljw;

    iget-object v0, p1, Lki;->v:Lkb;

    iput-object v0, p0, Lki$a;->t:Lkb;

    iget-boolean v0, p1, Lki;->w:Z

    iput-boolean v0, p0, Lki$a;->u:Z

    iget-boolean v0, p1, Lki;->x:Z

    iput-boolean v0, p0, Lki$a;->v:Z

    iget-boolean v0, p1, Lki;->y:Z

    iput-boolean v0, p0, Lki$a;->w:Z

    iget v0, p1, Lki;->z:I

    iput v0, p0, Lki$a;->x:I

    iget v0, p1, Lki;->A:I

    iput v0, p0, Lki$a;->y:I

    iget v0, p1, Lki;->B:I

    iput v0, p0, Lki$a;->z:I

    iget p1, p1, Lki;->C:I

    iput p1, p0, Lki$a;->A:I

    return-void
.end method
