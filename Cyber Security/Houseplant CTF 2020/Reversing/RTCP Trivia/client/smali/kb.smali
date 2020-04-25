.class public interface abstract Lkb;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lkb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb$1;

    invoke-direct {v0}, Lkb$1;-><init>()V

    sput-object v0, Lkb;->a:Lkb;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end method
