.class public interface abstract Ljz;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljz$1;

    invoke-direct {v0}, Ljz$1;-><init>()V

    sput-object v0, Ljz;->a:Ljz;

    return-void
.end method


# virtual methods
.method public abstract a()V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation
.end method

.method public abstract b()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljy;",
            ">;"
        }
    .end annotation
.end method
