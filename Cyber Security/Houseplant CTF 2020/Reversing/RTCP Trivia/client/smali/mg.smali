.class public interface abstract Lmg;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lmg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg$1;

    invoke-direct {v0}, Lmg$1;-><init>()V

    sput-object v0, Lmg;->a:Lmg;

    return-void
.end method


# virtual methods
.method public abstract a()Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Z"
        }
    .end annotation
.end method

.method public abstract a(Lne;I)Z
.end method

.method public abstract b()Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Z"
        }
    .end annotation
.end method

.method public abstract c()V
.end method
